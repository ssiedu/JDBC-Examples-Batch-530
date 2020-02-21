
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetInsertExample {

    public static void main(String[] args) throws Exception {

        Connection con = Utility.connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
        while (rs.next()) {
            System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
        }
        System.out.println("_____________________________");
        Scanner sc = new Scanner(System.in);
        System.out.println("Do You Wish To Add More Data (1 to yes) : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Eno : ");
            int eno = sc.nextInt();
            System.out.println("Enter Ename : ");
            String name = sc.next();
            System.out.println("Enter Salary : ");
            int sal = sc.nextInt();
            //INSERTING ROW USING ResultSet
            //step-1 (empty row)
            rs.moveToInsertRow();
            //step-2 (modify the cols of new row)
            rs.updateInt(1, eno);
            rs.updateString(2, name);
            rs.updateInt(3, sal);
            //step-3 (save the row to DB)
            rs.insertRow();
            System.out.println("Row Added Successfully: ");
            System.out.println("Updated ResultSet .... : ");
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
            }
        } else {
            System.out.println("You Opted Not To Add .... ");
        }
        con.close();
    }
}
