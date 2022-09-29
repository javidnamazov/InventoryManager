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
public class MenuGetAllService implements Processable, Crudable {

    private boolean crud;
    private static MenuGetAllService instance = null;

    private MenuGetAllService() {
    }

    public static MenuGetAllService getInstance() { //singleton  pattern
        if (instance == null) {
            instance = new MenuGetAllService();
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
