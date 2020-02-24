
import java.sql.Connection;
import java.sql.DatabaseMetaData;


public class DBMDExample {
    public static void main(String[] args) throws Exception {
        
        Connection con=Utility.connect();
        DatabaseMetaData dbmd=con.getMetaData();
        
        String dbProduct=dbmd.getDatabaseProductName();
        String dbVersion=dbmd.getDatabaseProductVersion();
        String driver=dbmd.getDriverName();
        String driverVersion=dbmd.getDriverVersion();
        System.out.println(dbProduct);
        System.out.println(dbVersion);
        System.out.println(driver);
        System.out.println(driverVersion);
        con.close();

    }
}
