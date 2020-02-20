import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {
 public static void main(String[] args) throws Exception {
        Connection con = Utility.connect();
        String sql = "SELECT eno,ename,sal as msal,sal*12 as ysal FROM emp";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.println(rs.getString("eno")+","+rs.getString("ename")+","+rs.getString("msal")+","+rs.getString("ysal"));
        }
        con.close();
    }    
}
