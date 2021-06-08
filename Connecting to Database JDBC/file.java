import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class file{
    public static void main(String args[]) {
    try{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage?zeroDateTimeBehavior=convertToNull","root","09072001");
    Statement stmt= com.createStatement();
    String s="SELECT * from login";
    ResultSet r=stmt.executeQuery(s);
    if(r.next()){
       System.out.println(r.getString(1)+" "+r.getString(2));
    }
   com.close();
    
    }
    catch(SQLException | ClassNotFoundException ex){
        ex.printStackTrace();
    }     
    
    }                
}

