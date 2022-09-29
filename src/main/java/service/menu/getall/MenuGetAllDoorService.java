/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.getall;

import dao.inter.ObjectDaoInter;
import main.ObjectFactory;
import service.inter.menu.MenuDoorServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetAllDoorService implements MenuDoorServiceInter {

    @Override
    public void process() {
        ObjectDaoInter obj = ObjectFactory.getInstanceDao("door");
        System.out.println(obj.getAll());
    }
}
