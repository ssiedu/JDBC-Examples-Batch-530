
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetDeletionExample {
    public static void main(String[] args) throws Exception {

        Connection con = Utility.connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
        }
        System.out.println("_____________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Wish To Delete A Row (1 to yes) : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Rowno : ");
            int rno = sc.nextInt();
            //Deleting The Row 
            //step-1 move the cursor
            rs.absolute(rno);
            //step-2 delete the row
            rs.deleteRow();
            System.out.println("Row Removed Successfully: ");
            System.out.println("Updated ResultSet .... : ");
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
            }
        } else {
            System.out.println("You Opted Not To Delete .... ");
        }
        con.close();
    }
}
