/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.inter;

import bean.ObjectInRoom;
import java.util.List;

/**
 *
 * @author namaz
 */
public interface ObjectDaoInter {

    List<ObjectInRoom> getAll();

    ObjectInRoom getById(int id);

    boolean add(ObjectInRoom obj);

    boolean update(int id, ObjectInRoom obj);

    boolean delete(int id);
}
