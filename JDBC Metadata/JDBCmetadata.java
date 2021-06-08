import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCmetadata{
    public static void main(String args[]) {
     try{
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage?zeroDateTimeBehavior=convertToNull","root","09072001");
    DatabaseMetaData dbmd=com.getMetaData();  
  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());    
com.close();
    
    }
    catch(SQLException | ClassNotFoundException ex){
        ex.printStackTrace();
    }
      
    
    }                
}

