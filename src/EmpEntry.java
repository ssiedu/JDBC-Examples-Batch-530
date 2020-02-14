import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpEntry {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
            System.out.println("Connected Successfully");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
