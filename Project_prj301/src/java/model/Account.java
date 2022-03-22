/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author trinh
 */
public class Account {
    private int id;
    private String user;
    private String pass;
    int role_id;
    int Status_id;

    public Account() {
    }

    public Account(int id, String user, String pass, int role_id, int Status_id) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.role_id = role_id;
        this.Status_id = Status_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getStatus_id() {
        return Status_id;
    }

    public void setStatus_id(int Status_id) {
        this.Status_id = Status_id;
    }

    
    
   

    
}
