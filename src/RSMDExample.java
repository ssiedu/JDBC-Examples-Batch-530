
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;


public class RSMDExample {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Table Name : ");
        String tname=sc.next();
        
        String sql="SELECT * FROM "+tname;
        
        Connection con=Utility.connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        ResultSetMetaData rsmd=rs.getMetaData();
        int n=rsmd.getColumnCount();
        
        System.out.println("_________________________________");
        for(int i=1; i<=n; i++){
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println();
        System.out.println("_________________________________");
        while(rs.next()){
            for(int i=1;i<=n;i++){
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
        }
        System.out.println("_________________________________");
        con.close();
    }
}
