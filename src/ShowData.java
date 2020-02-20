import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowData {
    public static void main(String[] args) throws Exception {
        Connection con = Utility.connect();
        String sql = "SELECT * FROM emp";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        rs.isFirst();
        
        System.out.println(rs.getRow());
        rs.last();  //current-row 9last)
        //System.out.println(rs.getRow());
        
        
//        boolean result=rs.next();
  //      System.out.println(result);
        
        /*
        //before-first
        while (rs.next()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
        }
        //after-last
        System.out.println("________________________________");
        //rs.beforeFirst();
        //rs.absolute(2);
        while (rs.previous()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
        }
        */
        con.close();
    }
}
