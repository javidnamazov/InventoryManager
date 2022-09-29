/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author namaz
 */
public abstract class ObjectInRoom {

    private int id;
    private String brand;
    private String color;
    private String material;
    private String cost;

    public ObjectInRoom(int id, String brand, String color, String material, String cost) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.cost = cost;
    }

    public ObjectInRoom() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ObjectInRoom{" + "id=" + id + ", brand=" + brand + ", color=" + color + ", material=" + material + ", cost=" + cost + '}';
    }

}
