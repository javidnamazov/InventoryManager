/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.delete;

import dao.inter.ObjectDaoInter;
import java.util.Scanner;
import main.ObjectFactory;
import service.inter.menu.MenuBedServiceInter;

/**
 *
 * @author namaz
 */
public class MenuDeleteBedService implements MenuBedServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the 'id' of the bed: ");
        int id = sc.nextInt();

        ObjectDaoInter obj = ObjectFactory.getInstanceDao("bed");
        obj.delete(id);

        System.out.println("Bed has been deleted successfully!");
    }
}
