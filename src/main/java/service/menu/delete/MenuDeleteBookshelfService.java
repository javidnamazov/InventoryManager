/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.delete;

import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuBookshelfServiceInter;

/**
 *
 * @author namaz
 */
public class MenuDeleteBookshelfService implements MenuBookshelfServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 'id' of the bookshelf: ");
        int id = sc.nextInt();

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bookshelf");
        obj.delete(id);

        System.out.println("Bookshelf has been deleted successfully!");
    }
}
