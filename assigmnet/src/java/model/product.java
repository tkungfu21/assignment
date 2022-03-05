/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class product {
    int id;
    String name;
    String img;
    String price;
    int cate;

    public product(int id, String name, String img, String price, int cate) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.cate = cate;
    }

    public product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", img=" + img + ", price=" + price + ", cate=" + cate + '}';
    }
     
}
