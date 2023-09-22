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
//            int idx = 1;
////            rs.next();
//            while(nrs.next()) {
//                System.out.print(idx++ + ". ");
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
    
    public static Connection c;
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://mysql-532bcf9-info-ae4f.aivencloud.com:20149/defaultdb?useSSL=false";
            String un = "avnadmin";
            String pw = "AVNS_5n0lAPq6CJnFNq8g5LP";
            
            c = DriverManager.getConnection(url, un, pw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void IUD(String query) throws Exception {
        Statement s = c.createStatement();
        s.executeUpdate(query);
    }
    
    public static ResultSet SEARCH(String query) throws Exception {
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        
        return rs;
    }
        
    
//    public static void main(String[] args) {
//        dbConnection dbcon = new dbConnection();
//        String db = "SELECT * FROM es_product";
////        dbcon.db_con(db, "product_name");
////        System.out.println("1");
//    }
}

