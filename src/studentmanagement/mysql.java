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

public class mysql {
    private Connection connect =null;
    private Statement statement =null;
    private PreparedStatement PreparedStatement =null;
    private ResultSet result =null;
    Scanner sc = null;
    
    
    
    void readata(){
        try {
            connect = APIclient.getInstance();
            sc = new Scanner(System.in);
            
            
            PreparedStatement = connect.prepareStatement("SELECT name,age,gender,cgpa FROM studentinfo WHERE name = ?;");
            System.out.println("Name :");
            PreparedStatement.setString(1,sc.nextLine());
            
            result = PreparedStatement.executeQuery();
            while(result.next()){
            System.out.println("name:"+result.getString("name"));
            System.out.println("age:"+result.getString("age"));
            System.out.println("gender:"+result.getString("gender"));
            System.out.println("Cgpa:"+result.getString("cgpa"));
            }
        } 
        
        catch (Exception e) {
        }
        
    
        
        
        
        
        
    
    }
       

    
    }


