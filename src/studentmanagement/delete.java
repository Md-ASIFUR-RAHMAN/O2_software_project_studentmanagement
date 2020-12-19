
package studentmanagement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class delete {
    

    private Connection connect =null;
    private Statement statement =null;
    private PreparedStatement preparedStatement =null;
    private ResultSet result =null;
    Scanner sc = null;
    
    
    
        
    void deletee(){
        
        try {
            try {
                connect = APIclient.getInstance();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
          sc = new Scanner(System.in);
            
            
            
        System.out.println("Name : ");
        String name = sc.next();
        

        
        
        
        PreparedStatement ps = connect.prepareStatement("DELETE FROM  studentinfo WHERE name =?;");
        
        ps.setString(1,name);

        
        
        
        
        ps.execute();
        
        
        
        
        
        System.out.println("Delete Successful ");
        
      } catch (SQLException e) {
       System.out.println(e.getMessage());
      }
  }
}
