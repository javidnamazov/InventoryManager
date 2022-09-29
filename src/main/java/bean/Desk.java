/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author namaz
 */
public class Desk extends ObjectInRoom {

    private String length;
    private String width;

    public Desk(int id, String brand, String color, String material, String cost, String length, String width) {
        super(id, brand, color, material, cost);
        this.length = length;
        this.width = width;
    }

    public Desk() {
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Desk{" + "id=" + this.getId() + ", brand=" + this.getBrand() + ", color=" + this.getColor() + ", material=" + this.getMaterial() + ", cost=" + this.getCost() + ", length=" + length + ", width=" + width + '}';
    }
}
