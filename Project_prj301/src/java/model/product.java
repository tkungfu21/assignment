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
    String title;
    String description;
    int cate;
    int sell_id;

    public product() {
    }

    public product(int id, String name, String img, String price, String title, String description, int cate, int sell_id) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.price = price;
        this.title = title;
        this.description = description;
        this.cate = cate;
        this.sell_id = sell_id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    public int getSell_id() {
        return sell_id;
    }

    public void setSell_id(int sell_id) {
        this.sell_id = sell_id;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", img=" + img + ", price=" + price + ", title=" + title + ", description=" + description + ", cate=" + cate + ", sell_id=" + sell_id + '}';
    }
    
    
     
}
