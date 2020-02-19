
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintData {
    /*
    public static String getAll(ResultSet rs)throws Exception {
        String res=rs.getString(1)+","+rs.getString(2)+","+rs.getString(3);
        return res;
    }
    */
    public static void main(String[] args) throws Exception {
        //reading the details of those emps who are earning >=25000
        Connection con = Utility.connect();
        String sql = "SELECT * FROM emp WHERE sal>=25000";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            //String str=getAll(rs);
            //System.out.println(str);
            String s1 = rs.getString("eno");
            String s2 = rs.getString("ename");
            int s3 = rs.getInt("sal");
            int yrSal=s3*12;
            System.out.println(s1 + "," + s2 + "," + s3+","+yrSal);
        }
        con.close();

    }
}
