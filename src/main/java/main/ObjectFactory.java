/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import dao.impl.*;
import dao.inter.ObjectDaoInter;
import service.inter.Crudable;
import service.menu.crud.MenuAddService;
import service.menu.crud.MenuDeleteService;
import service.menu.crud.MenuGetAService;
import service.menu.crud.MenuGetAllService;
import service.menu.crud.MenuUpdateService;

/**
 *
 * @author namaz
 */
public class ObjectFactory {//factory pattern

    public static ObjectDaoInter getInstanceDao(String objectInRoom) {
        if (objectInRoom == null) {
            return null;
        }
        if (objectInRoom.equalsIgnoreCase("bed")) {
            return new BedDaoImpl();
        } else if (objectInRoom.equalsIgnoreCase("bookshelf")) {
            return new BookshelfDaoImpl();
        } else if (objectInRoom.equalsIgnoreCase("chair")) {
            return new ChairDaoImpl();
        } else if (objectInRoom.equalsIgnoreCase("door")) {
            return new DoorDaoImpl();
        } else if (objectInRoom.equalsIgnoreCase("desk")) {
            return new DeskDaoImpl();
        } else if (objectInRoom.equalsIgnoreCase("wardrobe")) {
            return new WardrobeDaoImpl();
        }
        return null;
    }

    public static Crudable getObj(String crudObj) {
        if (crudObj == null) {
            return null;
        }
        if (crudObj.equalsIgnoreCase("Add object")) {
            return MenuAddService.getInstance();
        } else if (crudObj.equalsIgnoreCase("Delete object")) {
            return MenuDeleteService.getInstance();
        } else if (crudObj.equalsIgnoreCase("Update object")) {
            return MenuUpdateService.getInstance();
        } else if (crudObj.equalsIgnoreCase("Get all objects")) {
            return MenuGetAllService.getInstance();
        } else if (crudObj.equalsIgnoreCase("Get an object")) {
            return MenuGetAService.getInstance();
        }
        return null;
    }
}
