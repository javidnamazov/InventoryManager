/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import bean.ObjectInRoom;
import bean.Wardrobe;
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
public class WardrobeDaoImpl extends AbstractDAO implements ObjectDaoInter {

    @Override
    public List<ObjectInRoom> getAll() {
        List<ObjectInRoom> result = new ArrayList<>();
        try ( Connection c = connect()) {
            Statement stmt = c.createStatement();

            stmt.execute("select * from wardrobe");
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String height = rs.getString("height");
                String capacity = rs.getString("capacity");

                result.add(new Wardrobe(id, brand, color, material, cost, length, height, capacity));
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

            stmt.execute("select * from wardrobe where id=" + objId);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                String color = rs.getString("color");
                String material = rs.getString("material");
                String cost = rs.getString("cost");
                String length = rs.getString("length");
                String height = rs.getString("height");
                String capacity = rs.getString("capacity");

                result = new Wardrobe(id, brand, color, material, cost, length, height, capacity);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return result;
        }
    }

    @Override
    public boolean add(ObjectInRoom obj) {
        Wardrobe w = (Wardrobe) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("INSERT INTO wardrobe (brand, color, material, cost, length, height, capacity) VALUES (?, ?, ?, ?, ?, ?, ?)");

            stmt.setString(1, w.getBrand());
            stmt.setString(2, w.getColor());
            stmt.setString(3, w.getMaterial());
            stmt.setString(4, w.getCost());
            stmt.setString(5, w.getLength());
            stmt.setString(6, w.getHeight());
            stmt.setString(7, w.getCapacity());

            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(int id, ObjectInRoom obj) {
        Wardrobe w = (Wardrobe) obj;
        try ( Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update wardrobe set brand=?,color=?,material=?,cost=?,length=?,height=?,capacity=? where id=?");

            stmt.setString(1, w.getBrand());
            stmt.setString(2, w.getColor());
            stmt.setString(3, w.getMaterial());
            stmt.setString(4, w.getCost());
            stmt.setString(5, w.getLength());
            stmt.setString(6, w.getHeight());
            stmt.setString(7, w.getCapacity());
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

            return stmt.execute("delete from wardrobe where id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
