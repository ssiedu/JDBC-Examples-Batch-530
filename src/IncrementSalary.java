
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class IncrementSalary {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ECode : ");
        int id=sc.nextInt();
        System.out.println("Enter Increment Amount : ");
        int amt=sc.nextInt();
        String sql="UPDATE emp SET sal=sal+? WHERE eno=?";
        //to run parameterized queries we need PreparedStatement
        Connection con=Utility.connect();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, amt);
        ps.setInt(2, id);
        int n=ps.executeUpdate();
        System.out.println(n+" rows modified");
        con.close();
        
    }
}
