package employee.payroll.system;
import java.sql.*;
import javax.swing.*;
public class db {

    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\krushna wani\\Employee Payroll System\\empnet.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
