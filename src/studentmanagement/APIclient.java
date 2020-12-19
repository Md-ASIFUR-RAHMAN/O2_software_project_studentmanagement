/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
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
