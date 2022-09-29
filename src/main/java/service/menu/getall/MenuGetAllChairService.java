/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.getall;

import dao.inter.ObjectDaoInter;
import main.ObjectFactory;
import service.inter.menu.MenuChairServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetAllChairService implements MenuChairServiceInter {

    @Override
    public void process() {
        ObjectDaoInter obj = ObjectFactory.getInstanceDao("chair");
        System.out.println(obj.getAll());
    }
}
