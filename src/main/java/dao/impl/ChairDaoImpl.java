/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import bean.Chair;
import bean.ObjectInRoom;
import dao.inter.AbstractDAO;
import dao.inter.ObjectDaoInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namaz
 */
public class ChairDaoImpl extends AbstractDAO implements ObjectDaoInter {

    @Override
    public List<ObjectInRoom> getAll() {
        List<ObjectInRoom> result = new ArrayList<>();
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();

            stmt.execute("select * from chair");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String width = rs.getString("width");
                String height = rs.getString("height");

                result.add(new Chair(id, brand, color, material, cost, length, width, height));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public ObjectInRoom getById(int objId) {
        ObjectInRoom result = null;
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();

            stmt.execute("select * from chair where id=" + objId);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String width = rs.getString("width");
                String height = rs.getString("height");

                result = new Chair(id, brand, color, material, cost, length, width, height);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return result;
        }
    }

    @Override
    public boolean add(ObjectInRoom obj) {
        Chair ch = (Chair) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO chair (brand, color, material, cost, length, width, height) VALUES (?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, ch.getBrand());
            stmt.setString(2, ch.getColor());
            stmt.setString(3, ch.getMaterial());
            stmt.setString(4, ch.getCost());
            stmt.setString(5, ch.getLength());
            stmt.setString(6, ch.getWidth());
            stmt.setString(7, ch.getHeight());

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(int id, ObjectInRoom obj) {
        Chair ch = (Chair) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update chair set brand=?,color=?,material=?,cost=?,length=?,width=?,height=? where id=?");

            stmt.setString(1, ch.getBrand());
            stmt.setString(2, ch.getColor());
            stmt.setString(3, ch.getMaterial());
            stmt.setString(4, ch.getCost());
            stmt.setString(5, ch.getLength());
            stmt.setString(6, ch.getWidth());
            stmt.setString(7, ch.getHeight());
            stmt.setInt(8, id);

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();

            return stmt.execute("delete from chair where id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
