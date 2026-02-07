/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Picasso.model;

/**
 *
 * @author Supasin
 */

public class GetItem {
    private static GetItem instance;
    private String id;
    private String goodsName;
    private double price;
    private double weight;

    private GetItem() {
        this.id = "";
        this.goodsName = "";
        this.price = 0.0;
        this.weight = 0.0;
    }

    public static synchronized GetItem getInstance() {
        if (instance == null) {
            instance = new GetItem();
        }
        return instance;
    }

    public void setItem(String id, String goodsName, double weight, double price) {
        this.id = id;
        this.goodsName = goodsName;
        this.weight = weight;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return String.format("ID:%s Name:%s Weight:%.2f Price:%.2f", id, goodsName, weight, price);
    }
}
