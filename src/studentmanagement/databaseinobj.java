/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;




interface databaseinobj {
    
     ResultSet fetchData(Statement Statement );
     ResultSet insertData(Statement Statement );
}
