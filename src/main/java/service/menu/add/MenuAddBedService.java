/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.add;

import bean.Bed;
import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuBedServiceInter;

/**
 *
 * @author namaz
 */
public class MenuAddBedService implements MenuBedServiceInter {

    @Override
    public void process() {
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

        Bed b = new Bed();
        b.setBrand(br);
        b.setMaterial(mt);
        b.setColor(cl);
        b.setCost(cst);
        b.setLength(lng);
        b.setWidth(wid);

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bed");
        obj.add(b);

        System.out.println("Bed has been added successfully!");
    }

}
