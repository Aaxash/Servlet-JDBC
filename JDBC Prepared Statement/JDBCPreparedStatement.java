import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class JDBCPreparedStatement{
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage?zeroDateTimeBehavior=convertToNull","root","09072001");

    PreparedStatement ps = com.prepareStatement("insert into login values(?,?)");
            ps.setString(1,"Aakash911");
            ps.setString(2,"java");
            
            ps.executeUpdate();
    
      System.out.println("Success");
    } catch(SQLException ex){
      ex.printStackTrace();
        }
    }
    
  }
    

