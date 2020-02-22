
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ShowTotalSalary {

    public static void main(String[] args) throws Exception {
        //String sql="SELECT sal FROM emp";
        String sql="SELECT SUM(sal) FROM EMP";
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        rs.next();
        int total=rs.getInt(1);
        /*
        int total=0;
        while(rs.next()){
            total=total+rs.getInt(1);
        }
        */
        System.out.println("TOTAL SALARY : "+total);
        con.close();
    }
}
