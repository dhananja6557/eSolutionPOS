/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales;

/**
 *
 * @author eSolution
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eSolution
 */
public class dbConnection {
//    public void db_con(String  query, String data) {
//        String url = "jdbc:mysql://localhost/esolution_pos";
//        String uname = "root";
//        String pword = "test@123"; 
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url, uname, pword);
//            Statement st = con.createStatement();
//            ResultSet nrs = st.executeQuery(query);
////            rs.next();
//            while(nrs.next()) {
//                String datas = nrs.getString(data);
//                System.out.println(datas);
//            }
////            String datas = rs.getString(data);
//            
//            st.close();
//            con.close();
//            
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    static {
        String url = "jdbc:mysql://localhost/esolution_pos";
        String uname = "root";
        String pword = "test@123";         
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pword);
            Statement st = con.createStatement();
            ResultSet nrs = st.executeQuery(" SELECT * FROM es_product");
//            rs.next();
//            while(nrs.next()) {
//                String datas = nrs.getString(data);
//                System.out.println(datas);
//            }
//            String datas = rs.getString(data);
            
            st.close();
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    public static void main(String[] args) {
        dbConnection dbcon = new dbConnection();
        String db = "SELECT * FROM es_product";
//        dbcon.db_con(db, "product_name");
//        System.out.println("1");
    }
}

