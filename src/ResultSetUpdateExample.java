
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ResultSetUpdateExample {

    public static void main(String[] args) throws Exception {

        Connection con=Utility.connect();
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=stmt.executeQuery("SELECT * FROM EMP");
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        System.out.println("_____________________________");
        //we wish to change 3rd row's sal to 35000
        //step-1 (move the cursor to the row to be changed)
        rs.absolute(3);
        //step-2 (call the updatter method(s) to change col
        rs.updateInt(3,35000);
        //step-3 (save the changes to DB)
        rs.updateRow();
        System.out.println("Row Modified");
        rs.beforeFirst();
        System.out.println("AFTER-CHANGES : ");
        while(rs.next()){
            System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
        }
        System.out.println("_____________________________");
        
        
        
        
        
        con.close();
    }
}
