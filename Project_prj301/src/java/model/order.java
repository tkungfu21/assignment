/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class order {
    int oID;
    int sell_id;
    Date data_CreDate;
    double price;

    public order() {
    }

    public order(int oID, int sell_id, Date data_CreDate, double price) {
        this.oID = oID;
        this.sell_id = sell_id;
        this.data_CreDate = data_CreDate;
        this.price = price;
    }

    public int getoID() {
        return oID;
    }

    public void setoID(int oID) {
        this.oID = oID;
    }

    public int getSell_id() {
        return sell_id;
    }

    public void setSell_id(int sell_id) {
        this.sell_id = sell_id;
    }

    public Date getData_CreDate() {
        return data_CreDate;
    }

    public void setData_CreDate(Date data_CreDate) {
        this.data_CreDate = data_CreDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
