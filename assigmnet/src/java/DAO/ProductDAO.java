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



public class ProductDAO {
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
                list.add(new producrs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDate(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
