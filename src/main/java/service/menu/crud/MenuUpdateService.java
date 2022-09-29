/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu.crud;

import service.inter.Crudable;
import service.inter.Processable;

/**
 *
 * @author namaz
 */
public class MenuUpdateService implements Processable, Crudable {

    private boolean crud;
    private static MenuUpdateService instance = null;

    private MenuUpdateService() {
    }

    public static MenuUpdateService getInstance() {
        if (instance == null) {
            instance = new MenuUpdateService();
        }
        return instance;
    }

    @Override
    public void process() {
        getInstance().crud = true;
    }

    @Override
    public boolean isCrud() {
        return getInstance().crud;
    }

    public void setCrud(boolean crud) {
        this.crud = crud;
    }
}
