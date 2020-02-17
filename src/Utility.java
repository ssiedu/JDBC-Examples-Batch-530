
import java.sql.Connection;
import java.sql.DriverManager;

public class Utility {
    
    public static Connection connect() throws Exception {
        Class.forName(Data.DRIVER_NAME);
        Connection con=DriverManager.getConnection(Data.CONNECTION_URL, Data.USERNAME, Data.PASSWORD);
        return con;
    }
}
