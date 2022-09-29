/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import service.menu.add.MenuAddChairService;
import service.menu.add.MenuAddDoorService;
import service.menu.add.MenuAddWardrobeService;
import main.ObjectFactory;
import service.inter.Processable;
import service.menu.MenuGetAllObjectsService;
import service.menu.add.MenuAddBedService;
import service.menu.add.MenuAddBookshelfService;
import service.menu.add.MenuAddDeskService;
import service.menu.crud.MenuAddService;
import service.menu.crud.MenuDeleteService;
import service.menu.crud.MenuGetAService;
import service.menu.crud.MenuGetAllService;
import service.menu.crud.MenuUpdateService;
import service.menu.delete.MenuDeleteBedService;
import service.menu.delete.MenuDeleteBookshelfService;
import service.menu.delete.MenuDeleteChairService;
import service.menu.delete.MenuDeleteDoorService;
import service.menu.delete.MenuDeleteDeskService;
import service.menu.delete.MenuDeleteWardrobeService;
import service.menu.get.MenuGetBedService;
import service.menu.get.MenuGetBookshelfService;
import service.menu.get.MenuGetChairService;
import service.menu.get.MenuGetDoorService;
import service.menu.get.MenuGetDeskService;
import service.menu.get.MenuGetWardrobeService;
import service.menu.getall.MenuGetAllBedService;
import service.menu.getall.MenuGetAllBookshelfService;
import service.menu.getall.MenuGetAllChairService;
import service.menu.getall.MenuGetAllDoorService;
import service.menu.getall.MenuGetAllDeskService;
import service.menu.getall.MenuGetAllWardrobeService;
import service.menu.update.MenuUpdateBedService;
import service.menu.update.MenuUpdateBookshelfService;
import service.menu.update.MenuUpdateChairService;
import service.menu.update.MenuUpdateDoorService;
import service.menu.update.MenuUpdateDeskService;
import service.menu.update.MenuUpdateWardrobeService;

/**
 *
 * @author namaz
 */
public enum Menu {
    ADD(1, "Add object", MenuAddService.getInstance()),
    DELETE(2, "Delete object", MenuDeleteService.getInstance()),
    UPDATE(3, "Update object", MenuUpdateService.getInstance()),
    GET_ALL(4, "Get all objects", MenuGetAllService.getInstance()),
    GET_BY_ONE(5, "Get an object", MenuGetAService.getInstance()),
    GET_ALL_OBJECTS(6, "Get all type of objects", new MenuGetAllObjectsService()),
    //
    ADD_CHAIR(7, "Chair", new MenuAddChairService()),
    ADD_BED(8, "Bed", new MenuAddBedService()),
    ADD_DESK(9, "Desk", new MenuAddDeskService()),
    ADD_DOOR(10, "Door", new MenuAddDoorService()),
    ADD_WARDROBE(11, "Wardrobe", new MenuAddWardrobeService()),
    ADD_BOOKSHELF(12, "Bookshelf", new MenuAddBookshelfService()),
    //
    DELETE_CHAIR(13, "Chair", new MenuDeleteChairService()),
    DELETE_BED(14, "Bed", new MenuDeleteBedService()),
    DELETE_DESK(15, "Desk", new MenuDeleteDeskService()),
    DELETE_DOOR(16, "Door", new MenuDeleteDoorService()),
    DELETE_WARDROBE(17, "Wardrobe", new MenuDeleteWardrobeService()),
    DELETE_BOOKSHELF(18, "Bookshelf", new MenuDeleteBookshelfService()),
    //
    UPDATE_CHAIR(19, "Chair", new MenuUpdateChairService()),
    UPDATE_BED(20, "Bed", new MenuUpdateBedService()),
    UPDATE_DESK(21, "Desk", new MenuUpdateDeskService()),
    UPDATE_DOOR(22, "Door", new MenuUpdateDoorService()),
    UPDATE_WARDROBE(23, "Wardrobe", new MenuUpdateWardrobeService()),
    UPDATE_BOOKSHELF(24, "Bookshelf", new MenuUpdateBookshelfService()),
    //
    GET_ALL_CHAIR(25, "Chair", new MenuGetAllChairService()),
    GET_ALL_BED(26, "Bed", new MenuGetAllBedService()),
    GET_ALL_DESK(27, "Desk", new MenuGetAllDeskService()),
    GET_ALL_DOOR(28, "Door", new MenuGetAllDoorService()),
    GET_ALL_WARDROBE(29, "Wardrobe", new MenuGetAllWardrobeService()),
    GET_ALL_BOOKSHELF(30, "Bookshelf", new MenuGetAllBookshelfService()),
    //
    GET_A_CHAIR(31, "Chair", new MenuGetChairService()),
    GET_A_BED(32, "Bed", new MenuGetBedService()),
    GET_A_DESK(33, "Desk", new MenuGetDeskService()),
    GET_A_DOOR(34, "Door", new MenuGetDoorService()),
    GET_A_WARDROBE(35, "Wardrobe", new MenuGetWardrobeService()),
    GET_A_BOOKSHELF(36, "Bookshelf", new MenuGetBookshelfService()),
    //
    UNKNOWN;

    private int number;
    private String label;
    private Processable service;

    Menu() {
    }

    Menu(int number, String label, Processable service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    public void service() {
        service.process();

        if (this.getNumber() > 6 && this.getNumber() < 37) {
            MenuAddService.getInstance().setCrud(false);
            MenuDeleteService.getInstance().setCrud(false);
            MenuUpdateService.getInstance().setCrud(false);
            MenuGetAllService.getInstance().setCrud(false);
            MenuGetAService.getInstance().setCrud(false);
        }

        MenuUtil.showMenu();
    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();

        int crudNum = 0; // storing 'number' of 'Menu' having true 'crud'
        boolean isCrud = false;

        for (int i = 0; i < 5; i++) { // checking whether 'Menu' having true 'crud' exists
            if (ObjectFactory.getObj(menus[i].getLabel()).isCrud()) {
                isCrud = true;
                crudNum = menus[i].getNumber();
                break;
            }
        }

        for (int i = 0; i < 5; i++) { // crud pop up off
            if (isCrud) {
                break;
            }
            System.out.println(menus[i]);
            if (menus[i].getNumber() == 5) {
                System.out.println(menus[i + 1]);
            }
        }

        if (isCrud) { // crud pop up on
            if (menus[crudNum - 1] != null) {
                switch (menus[crudNum - 1]) {
                    case ADD:
                        for (int i = 6; i <= 11; i++) {
                            System.out.println(menus[i]);
                        }
                        break;
                    case DELETE:
                        for (int i = 12; i <= 17; i++) {
                            System.out.println(menus[i]);
                        }
                        break;
                    case UPDATE:
                        for (int i = 18; i <= 23; i++) {
                            System.out.println(menus[i]);
                        }
                        break;
                    case GET_ALL:
                        for (int i = 24; i <= 29; i++) {
                            System.out.println(menus[i]);
                        }
                        break;
                    case GET_BY_ONE:
                        for (int i = 30; i <= 35; i++) {
                            System.out.println(menus[i]);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static Menu find(int sent) {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == sent) {
                return menus[i];
            }
        }
        System.out.println("");
        return UNKNOWN;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

}
