/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.ObjectInRoom;
import dao.inter.ObjectDaoInter;
import java.util.List;
import main.ObjectFactory;
import service.inter.menu.MenuGetAllObjectsServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetAllObjectsService implements MenuGetAllObjectsServiceInter {

    @Override
    public void process() {
        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bed");
        List<ObjectInRoom> bList = obj.getAll();

        ObjectDaoInter obj2 = ObjectFactory.getInstanceDao("bookshelf");
        List<ObjectInRoom> bsList = obj2.getAll();

        ObjectDaoInter obj3 = ObjectFactory.getInstanceDao("chair");
        List<ObjectInRoom> cList = obj3.getAll();

        ObjectDaoInter obj4 = ObjectFactory.getInstanceDao("door");
        List<ObjectInRoom> dList = obj4.getAll();

        ObjectDaoInter obj5 = ObjectFactory.getInstanceDao("desk");
        List<ObjectInRoom> tList = obj5.getAll();

        ObjectDaoInter obj6 = ObjectFactory.getInstanceDao("wardrobe");
        List<ObjectInRoom> wList = obj6.getAll();

        if (!bList.isEmpty()) {
            System.out.println(bList + "\n");
        }
        if (!bsList.isEmpty()) {
            System.out.println(bsList + "\n");
        }
        if (!cList.isEmpty()) {
            System.out.println(cList + "\n");
        }
        if (!dList.isEmpty()) {
            System.out.println(dList + "\n");
        }
        if (!tList.isEmpty()) {
            System.out.println(tList + "\n");
        }
        if (!wList.isEmpty()) {
            System.out.println(wList);
        }
    }
}
