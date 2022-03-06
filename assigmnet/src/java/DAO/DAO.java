/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DAL.BaseDAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.product;
import model.Category;



public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null; 
    public  List<product> getAllProduct(){
           List<product> list = new ArrayList<>();
          String query = "SELECT [id]\n"
                + "      ,[name]\n"
                + "      ,[image]\n"
                + "      ,[price]\n"
                + "      ,[cateID]\n"
                + "  FROM [Wish].[dbo].[product]";
        try {
            conn = new BaseDAL().getConnection(); 
            ps = conn.prepareStatement(query);    
            rs = ps.executeQuery();               
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Category> getAllCategorys() {
        List<Category> clist = new ArrayList<>();
        String query = "SELECT  [cid]\n"
                + "      ,[cname]\n"
                + "  FROM [Wish].[dbo].[Category]";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                clist.add(new Category(rs.getInt(1),
                        rs.getString(2)
                ));
            }
        } catch (Exception e) {
        }
        return clist;
    }
     public  List<product> getAllProductByCid(String cid){
         List<product> list = new ArrayList<>();
         String query = "SELECT [id]\n"
                 + "      ,[name]\n"
                 + "      ,[image]\n"
                 + "      ,[price]\n"
                 + "      ,[cateID]\n"
                 + "  FROM [Wish].[dbo].[product] WHERE cateID = ?";
        try {
            conn = new BaseDAL().getConnection(); 
            ps = conn.prepareStatement(query);   
            ps.setString(1, cid);
            rs = ps.executeQuery();               
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<product> list= dao.getAllProduct();
        for (product o : list) {
            System.out.println(o);
        }
    }
}
