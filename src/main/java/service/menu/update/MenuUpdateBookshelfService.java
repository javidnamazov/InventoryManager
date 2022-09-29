/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.update;

import bean.Bookshelf;
import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuBookshelfServiceInter;

/**
 *
 * @author namaz
 */
public class MenuUpdateBookshelfService implements MenuBookshelfServiceInter {

    @Override
    public void process() {
        Scanner sc0 = new Scanner(System.in);
        System.out.print("Please enter the id of the bookshelf you want to update: ");
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
        System.out.print("Please enter the height: ");
        String hgt = sc5.nextLine();

        Scanner sc6 = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        String lng = sc6.nextLine();

        Scanner sc7 = new Scanner(System.in);
        System.out.print("Please enter the capacity: ");
        String cap = sc7.nextLine();

        Bookshelf bs = new Bookshelf();
        bs.setBrand(br);
        bs.setMaterial(mt);
        bs.setColor(cl);
        bs.setCost(cst);
        bs.setHeight(hgt);
        bs.setLength(lng);
        bs.setCapacity(cap);

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bookshelf");
        obj.update(id, bs);

        System.out.println("Bookshelf has been updated successfully!");
    }
}
