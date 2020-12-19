/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;


public class update {
    

    private Connection connect =null;
    private Statement statement =null;
    private PreparedStatement preparedStatement =null;
    private ResultSet result =null;
    Scanner sc = null;
    
    
    
        
    void updatee(){
        
        try {
            try {
                connect = APIclient.getInstance();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
          sc = new Scanner(System.in);
            
            
            
        System.out.println("Cgpa : ");
        String Cgpa = sc.next();
        System.out.println("Name: ");
        String Name = sc.next();


        
        
        

        PreparedStatement ps = connect.prepareStatement("UPDATE studentinfo SET cgpa=?  WHERE Name=?;");
        

        ps.setString(1, Cgpa);
        ps.setString(2, Name );

        
        
        
        
        ps.execute();
        
        
        
        
        
        System.out.println("Update Successful ");
        
      } catch (SQLException e) {
       System.out.println(e.getMessage());
      }
  }
}