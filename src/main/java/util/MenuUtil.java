/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author namaz
 */
public class MenuUtil {

    public static void showMenu() {       
        Scanner sc = new Scanner(System.in);
        
        Menu.showAllMenu();       
        System.out.print("\nPlease enter the Menu: ");
        int sent = sc.nextInt();
        Menu selectedMenu = Menu.find(sent);
        selectedMenu.service();
    }
}
