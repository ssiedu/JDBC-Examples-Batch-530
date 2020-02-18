
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class AddEmp {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Code : ");
        int code=sc.nextInt();
        System.out.println("Enter Name : ");
        String name=sc.next();
        System.out.println("Enter Sal  : ");
        int sal=sc.nextInt();
        
        String sql="INSERT INTO emp VALUES(?,?,?)";
        Connection con=Utility.connect();
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1, code);
        ps.setString(2, name);
        ps.setInt(3, sal);
        int n=ps.executeUpdate();
        System.out.println(n+" row created");
        con.close();
        
    }
}
