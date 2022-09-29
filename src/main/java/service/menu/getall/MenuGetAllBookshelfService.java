/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.getall;

import dao.inter.ObjectDaoInter;
import main.ObjectFactory;
import service.inter.menu.MenuBookshelfServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetAllBookshelfService implements MenuBookshelfServiceInter {

    @Override
    public void process() {
        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bookshelf");
        System.out.println(obj.getAll());
    }
}
