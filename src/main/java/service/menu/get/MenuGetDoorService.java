/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.get;

import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuDoorServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetDoorService implements MenuDoorServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 'id' of the door: ");
        int id = sc.nextInt();

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("door");
        System.out.println(obj.getById(id));
    }
}
