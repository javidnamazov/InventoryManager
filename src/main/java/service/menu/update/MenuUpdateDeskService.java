/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.update;

import bean.Desk;
import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuDeskServiceInter;

/**
 *
 * @author namaz
 */
public class MenuUpdateDeskService implements MenuDeskServiceInter {

    @Override
    public void process() {
        Scanner sc0 = new Scanner(System.in);
        System.out.print("Please enter the id of the desk you want to update: ");
        int id = sc0.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the brand: ");
        String br = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please enter the material: ");
        String mt = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Please enter the color: ");
        String cl = sc3.nextLine();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Please enter the cost: ");
        String cst = sc4.nextLine();

        Scanner sc5 = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        String lng = sc5.nextLine();

        Scanner sc6 = new Scanner(System.in);
        System.out.print("Please enter the width: ");
        String wid = sc6.nextLine();

        Desk t = new Desk();
        t.setBrand(br);
        t.setMaterial(mt);
        t.setColor(cl);
        t.setCost(cst);
        t.setLength(lng);
        t.setWidth(wid);

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("desk");
        obj.update(id, t);

        System.out.println("Desk has been updated successfully!");
    }
}
