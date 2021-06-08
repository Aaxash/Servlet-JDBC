import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class Resultsetmetadata{
    public static void main(String args[]) {
     try{
   
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage?zeroDateTimeBehavior=convertToNull","root","09072001");
     
PreparedStatement ps=com.prepareStatement("select * from login");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total Columns: "+rsmd.getColumnCount());  
System.out.println("Name of 1st Column: "+rsmd.getColumnName(1));  
System.out.println("Type of 1st Column: "+rsmd.getColumnTypeName(1));  
    
    
   com.close();
    
    }
    catch(SQLException | ClassNotFoundException ex){
        ex.printStackTrace();
    }
      
    
    }                
}

