/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.getall;

import dao.inter.ObjectDaoInter;
import main.ObjectFactory;
import service.inter.menu.MenuDeskServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetAllDeskService implements MenuDeskServiceInter {

    @Override
    public void process() {
        ObjectDaoInter obj = ObjectFactory.getInstanceDao("desk");
        System.out.println(obj.getAll());
    }
}
