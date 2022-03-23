/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAL.BaseDAL;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.product;
import model.Category;
import model.order;

public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<product> getAllProduct() {
        List<product> list = new ArrayList<>();
        String query = "SELECT TOP 1000 [id]\n"
                + "      ,[name]\n"
                + "      ,[image]\n"
                + "      ,[price]\n"
                + "      ,[title]\n"
                + "      ,[description]\n"
                + "      ,[cateID]\n"
                + "      ,[sell_ID]\n"
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
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)
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

    public List<product> getAllProductByCid(String cid) {
        List<product> list = new ArrayList<>();
        String query = "SELECT  [id]\n"
                + "      ,[name]\n"
                + "      ,[image]\n"
                + "      ,[price]\n"
                + "      ,[title]\n"
                + "      ,[description]\n"
                + "      ,[cateID]\n"
                + "      ,[sell_ID]\n"
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
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public product getProductByPid(String pid) {
        String query = "SELECT  [id]\n"
                + "      ,[name]\n"
                + "      ,[image]\n"
                + "      ,[price]\n"
                + "      ,[title]\n"
                + "      ,[description]\n"
                + "      ,[cateID]\n"
                + "      ,[sell_ID]\n"
                + "  FROM [Wish].[dbo].[product] WHERE [id] = ?";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<product> getProductByName(String text) {
        List<product> list = new ArrayList<>();
        String query = "SELECT  [id]\n"
                + "      ,[name]\n"
                + "      ,[image]\n"
                + "      ,[price]\n"
                + "      ,[title]\n"
                + "      ,[description]\n"
                + "      ,[cateID]\n"
                + "      ,[sell_ID]\n"
                + "  FROM [Wish].[dbo].[product] WHERE [name] LIKE ? ";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + text + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Account login(String user, String pass, String role_id) {
        String query = "SELECT [uID]\n"
                + "      ,[user]\n"
                + "      ,[pass]\n"
                + "      ,[role_id]\n"
                + "      ,[status_id]\n"
                + "  FROM [Wish].[dbo].[Account] where [user] = ? and [pass] = ? and [role_id] = ? and [status_id] = 1";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, role_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Account checkAccountExist(String user) {
        String query = "select * from account\n"
                + "where [user] = ?\n";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void singup(String user, String pass) {
        String query = "insert into account\n"
                + "values(?,?,2,3)";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProduct(String Pid) {
        String query = "DELETE FROM [Wish].[dbo].[product]\n"
                + "      WHERE id =  ?";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Pid);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(String name, String image, String price,
            String title, int category, String description, int sell_id, String pid) {
        String query = "UPDATE [Wish].[dbo].[product]\n"
                + "   SET [name] = ?\n"
                + "      ,[image] = ?\n"
                + "      ,[price] = ?\n"
                + "      ,[title] = ?\n"
                + "      ,[description] = ?\n"
                + "      ,[cateID] = ?\n"
                + "      ,[sell_ID] = ?\n"
                + " WHERE id = ?";
        try {
            conn = new BaseDAL().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setInt(6, category);
            ps.setInt(7, sell_id);
            ps.setString(8, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertProduct(String name, String image, String price,
            String title, String description, String category, int sid) {
        String query = "INSERT INTO [Wish].[dbo].[product]\n"
                + "           ([name]\n"
                + "           ,[image]\n"
                + "           ,[price]\n"
                + "           ,[title]\n"
                + "           ,[description]\n"
                + "           ,[cateID]\n"
                + "           ,[sell_ID])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            conn = new BaseDAL().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, category);
            ps.setInt(7, sid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Account> getAllAccounts() {
        List<Account> list = new ArrayList<>();
        String query = "SELECT [uID]\n"
                + "      ,[user]\n"
                + "      ,[pass]\n"
                + "      ,[role_id]\n"
                + "      ,[status_id]\n"
                + "  FROM [Wish].[dbo].[Account]";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<order> getAllOrderList() {
        List<order> list = new ArrayList<>();
        String query = "SELECT [oID]\n"
                + "      ,[sell_id]\n"
                + "      ,[createDate]\n"
                + "      ,[total_price]\n"
                + "  FROM [Wish].[dbo].[Order]";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDouble(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public order getOrderByID(String uid) {
        String query = "SELECT [oID]\n"
                + "      ,[sell_id]\n"
                + "      ,[createDate]\n"
                + "      ,[total_price]\n"
                + "  FROM [Wish].[dbo].[Order]\n"
                + "  WHERE [oID] = ?";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new order(rs.getInt(1), rs.getInt(2), rs.getDate(3), rs.getDouble(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void deleteAccount(String Uid) {
        String query = "DELETE FROM [Wish].[dbo].[Account]\n"
                + "      WHERE [uID] = ?";
        try {
            conn = new BaseDAL().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, Uid);

            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void insertOrder(int id, String total) {
        String query = "INSERT INTO [Wish].[dbo].[Order]\n"
                + "           ([sell_id]\n"
                + "           ,[createDate]\n"
                + "           ,[total_price])\n"
                + "     VALUES\n"
                + "           (? ,GETDATE(),?)";
        try {
            conn = new BaseDAL().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, total);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void SetingAccount(String uid, String Status_id) {
        String query = "UPDATE [Wish].[dbo].[Account]\n"
                + "   SET \n"
                + "      [status_id] = ?\n"
                + " WHERE [uID] = ?";
        try {
            conn = new BaseDAL().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, Status_id);
            ps.setString(2, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        product p = dao.getProductByPid("1");
        System.out.println(p);
    }

    public void uppdateOrder(String id, String sell, String date, String price) {
        String query = "UPDATE [Wish].[dbo].[Order]\n"
                + "   SET [sell_id] = ?\n"
                + "      ,[createDate] = ?\n"
                + "      ,[total_price] = ?\n"
                + " WHERE [oID] = ? ";
        try {
            conn = new BaseDAL().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, sell);
            ps.setString(2, date);
            ps.setString(3, price);
            ps.setString(4, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void 
}
