/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author namaz
 */
public class Chair extends ObjectInRoom {

    private String length;
    private String width;
    private String height;

    public Chair(int id, String brand, String color, String material, String cost, String length, String width, String height) {
        super(id, brand, color, material, cost);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Chair() {
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair{" + "id=" + this.getId() + ", brand=" + this.getBrand() + ", color=" + this.getColor() + ", material=" + this.getMaterial() + ", cost=" + this.getCost() + ", length=" + length + ", width=" + width + ", height=" + height + '}';
    }
}
