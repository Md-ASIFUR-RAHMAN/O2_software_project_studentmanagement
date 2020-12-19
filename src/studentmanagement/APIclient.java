
package studentmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class APIclient {

    private static Connection connector;
    static Connection getInstance() throws SQLException, ClassNotFoundException
    {
    if(connector == null)
    {
        connector = DriverManager.getConnection("jdbc:mysql://localhost/student_management?"+"user=root");
    }
      return connector;
    }
    
    
    
}
