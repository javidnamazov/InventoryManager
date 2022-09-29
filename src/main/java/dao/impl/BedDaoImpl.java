/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import bean.Bed;
import bean.ObjectInRoom;
import dao.inter.AbstractDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import dao.inter.ObjectDaoInter;

/**
 *
 * @author namaz
 */
public class BedDaoImpl extends AbstractDAO implements ObjectDaoInter {

    @Override
    public List<ObjectInRoom> getAll() {
        List<ObjectInRoom> result = new ArrayList<>();
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();

            stmt.execute("select * from bed");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String width = rs.getString("width");

                result.add(new Bed(id, brand, color, material, cost, length, width));
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

            stmt.execute("select * from bed where id=" + objId);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String width = rs.getString("width");

                result = new Bed(id, brand, color, material, cost, length, width);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return result;
        }
    }

    @Override
    public boolean add(ObjectInRoom obj) {
        Bed b = (Bed) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO bed (brand, color, material, cost, length, width) VALUES (?, ?, ?, ?, ?, ?)");

            stmt.setString(1, b.getBrand());
            stmt.setString(2, b.getColor());
            stmt.setString(3, b.getMaterial());
            stmt.setString(4, b.getCost());
            stmt.setString(5, b.getLength());
            stmt.setString(6, b.getWidth());

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(int id, ObjectInRoom obj) {
        Bed b = (Bed) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update bed set brand=?,color=?,material=?,cost=?,length=?,width=? where id=?");

            stmt.setString(1, b.getBrand());
            stmt.setString(2, b.getColor());
            stmt.setString(3, b.getMaterial());
            stmt.setString(4, b.getCost());
            stmt.setString(5, b.getLength());
            stmt.setString(6, b.getWidth());
            stmt.setInt(7, id);

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

            return stmt.execute("delete from bed where id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
