/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.add;

import bean.Wardrobe;
import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuWardrobeServiceInter;

/**
 *
 * @author namaz
 */
public class MenuAddWardrobeService implements MenuWardrobeServiceInter {

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
        System.out.print("Please enter the height: ");
        String hgt = sc5.nextLine();

        Scanner sc6 = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        String lng = sc6.nextLine();

        Scanner sc7 = new Scanner(System.in);
        System.out.print("Please enter the capacity: ");
        String cap = sc7.nextLine();

        Wardrobe w = new Wardrobe();
        w.setBrand(br);
        w.setMaterial(mt);
        w.setColor(cl);
        w.setCost(cst);
        w.setHeight(hgt);
        w.setLength(lng);
        w.setCapacity(cap);

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("wardrobe");
        obj.add(w);

        System.out.println("Wardrobe has been added successfully!");
    }
}
