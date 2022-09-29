/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.update;

import bean.Chair;
import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuChairServiceInter;

/**
 *
 * @author namaz
 */
public class MenuUpdateChairService implements MenuChairServiceInter {

    @Override
    public void process() {
        Scanner sc0 = new Scanner(System.in);
        System.out.print("Please enter the id of the chair you want to update: ");
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

        Scanner sc7 = new Scanner(System.in);
        System.out.print("Please enter the height: ");
        String hgt = sc7.nextLine();

        Chair ch = new Chair();
        ch.setBrand(br);
        ch.setMaterial(mt);
        ch.setColor(cl);
        ch.setCost(cst);
        ch.setLength(lng);
        ch.setWidth(wid);
        ch.setHeight(hgt);

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("chair");
        obj.update(id, ch);

        System.out.println("Chair has been updated successfully!");
    }
}
