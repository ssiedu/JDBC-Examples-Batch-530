
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//we want to increase salary of each emp by 1000 when ever
//we run this program
public class RaiseSalary {
    public static void main(String[] args) throws Exception {

        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");
        Connection con=Utility.connect();
        String sql="UPDATE emp SET sal=sal+1000";
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n+" rows modified");
        con.close();
    }
}
