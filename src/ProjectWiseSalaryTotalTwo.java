
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectWiseSalaryTotalTwo {
     public static void main(String[] args) throws Exception {
        String sql="SELECT pcode,SUM(sal) FROM EMPLOYEES GROUP BY pcode";
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        

        con.close();
    }
}
