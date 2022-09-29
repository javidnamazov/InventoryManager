/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.get;

import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuChairServiceInter;

/**
 *
 * @author namaz
 */
public class MenuGetChairService implements MenuChairServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 'id' of the chair: ");
        int id = sc.nextInt();

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("chair");
        System.out.println(obj.getById(id));
    }
}
