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
            
            
            
        System.out.println("ID : ");
        int id = sc.nextInt();
        //System.out.println("Name For Delete Info : ");
        //String Name = sc.next();
        
        
        
        
        PreparedStatement stmt = connect.prepareStatement("DELETE FROM  studentinfo WHERE id =?;");
        
        //PreparedStatement stmt = connect.prepareStatement("INSERT INTO studentinfo VALUES(?,?,?,?,?,?,?,?);");
        //stmt.setInt(1, Code);
        //stmt.setString(1, Name);
        stmt.setInt(1,id);

        
        
        
        
        stmt.execute();
        
        
        
        
        
        System.out.println("Delete Successful!");
        //System.out.println("");
        
      } catch (SQLException e) {
       System.out.println(e.getMessage());
      }
  }
}
