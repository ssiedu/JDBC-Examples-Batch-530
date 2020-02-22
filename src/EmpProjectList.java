
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class EmpProjectList {
    public static void main(String[] args) throws Exception {

        System.out.println("____________________________");
        System.out.println("Ename\tPTitle");
        System.out.println("____________________________");
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        String sql="SELECT ename, title FROM EMPLOYEES,PROJECTS WHERE employees.pcode=projects.pcode";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
                System.out.println("____________________________");

        con.close();
    }
}
