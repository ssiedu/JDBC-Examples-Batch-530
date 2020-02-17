
import java.sql.Connection;
import java.sql.Statement;


public class CreateTableExample {

    public static void main(String[] args) throws Exception {
        //String sql="CREATE TABLE SAMPLE (COL1 CHAR, COL2 CHAR)";
        String sql="DROP TABLE SAMPLE";
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        int n=stmt.executeUpdate(sql);
        System.out.println(n);
        con.close();
    }
}
