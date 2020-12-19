
package studentmanagement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class insert {
    
    private Connection connect =null;
    private Statement statement =null;
    private PreparedStatement preparedStatement =null;
    private ResultSet result =null;
    Scanner sc = null;

    
    void insertt(){
        
        try {
            try {
                connect = APIclient.getInstance();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
          sc = new Scanner(System.in);
            
            
            
        System.out.println("Code : ");
        int Code = sc.nextInt();
        System.out.println("Name : ");
        String Name = sc.next();
        System.out.println("gender : ");
        String gen = sc.next();
        System.out.println("age : ");
        int ag = sc.nextInt();
        System.out.println("b_date : ");
        String bdate = sc.next();
        System.out.println("c_sem : ");
        int currentsem = sc.nextInt();
        System.out.println("comp_sem : ");
        int completetsem = sc.nextInt();
        System.out.println("cgpa : ");
        String cgpa = sc.next();
        
        
        
        PreparedStatement ps = connect.prepareStatement("INSERT INTO studentinfo VALUES(?,?,?,?,?,?,?,?);");
        ps.setInt(1, Code);
        ps.setString(2, Name);
        ps.setString(3,gen);
        ps.setInt(4,ag);
        ps.setString(5, bdate);
        ps.setInt(6, currentsem );
        ps.setInt(7, completetsem );
        ps.setString(8, cgpa);
        
        
        
        
        ps.execute();
        
        
        
        
        
        System.out.println("Add Successful ");
        
      } catch (SQLException e) {
       System.out.println(e.getMessage());
      }
  }
}
    

