
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProjectWiseSalaryTotal {
     public static void main(String[] args) throws Exception {
        //String sql="SELECT sal FROM emp";
        String sql="SELECT pcode,sal FROM EMPLOYEES";
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        int t1=0,t2=0,t3=0;
        while(rs.next()){
            String code=rs.getString(1);
            switch(code){
                case "P111":
                    t1=t1+rs.getInt(2);
                break;
                case "P112":
                    t2=t2+rs.getInt(2);
                break;
                case "P113":
                    t3=t3+rs.getInt(2);
                break;
            }
        }
        System.out.println("P111 : "+t1);
        System.out.println("P112 : "+t2);
        System.out.println("P113 : "+t3);
        con.close();
    }
}
