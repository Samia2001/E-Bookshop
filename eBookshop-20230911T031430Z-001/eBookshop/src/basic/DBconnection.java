/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;
import java.sql.*;
/**
 *
 * @author user
 */
public class DBconnection {
    static final String DB_URL = "jdbc:mysql://localhost/bookshop" ;
    static final String USER = "root" ;
    static final String PASS = "Ahbakaskajin22*" ;
    public static Connection connectDB() {
        Connection con = null;
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            return con ;
        }
        catch(Exception ex){
            System.out.println("Error occured connecting to Database");
            return null;
        }
    }
}
