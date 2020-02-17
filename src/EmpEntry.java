import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpEntry {
    public static void main(String[] args) {
        try{
            //step-1 (Driver Loading)
            Class.forName(Data.DRIVER_NAME);
            System.out.println("Driver Loaded Successfully");
            //step-2 (Connection Establishment)
            Connection con=DriverManager.getConnection(Data.CONNECTION_URL, Data.USERNAME, Data.PASSWORD);
            System.out.println("Connected Successfully");
            //step-3 (Creating Statement Object to dispatch SQL to DB)
            Statement stmt=con.createStatement();
            int n=stmt.executeUpdate("INSERT INTO EMP VALUES(115,'eee',50000)");
            //step-4 (close the connection)
            con.close();
            System.out.println(n+" row added");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
