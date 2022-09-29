/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author namaz
 */
public class Wardrobe extends ObjectInRoom {

    private String length;
    private String height;
    private String capacity;

    public Wardrobe(int id, String brand, String color, String material, String cost, String length, String height, String capacity) {
        super(id, brand, color, material, cost);
        this.length = length;
        this.height = height;
        this.capacity = capacity;
    }

    public Wardrobe() {
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Wardrobe{" + "id=" + this.getId() + ", brand=" + this.getBrand() + ", color=" + this.getColor() + ", material=" + this.getMaterial() + ", cost=" + this.getCost() + ", length=" + length + ", height=" + height + ", capacity=" + capacity + '}';
    }
}
