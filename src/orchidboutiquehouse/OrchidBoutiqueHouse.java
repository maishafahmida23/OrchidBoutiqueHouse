/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orchidboutiquehouse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class OrchidBoutiqueHouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
            Connection connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databaseName=BOUTIQUE;"
                     +"encrypt=true;trustServerCertificate=true;"
                    + "selectMethod=cursor;", "sa", "123456" ); 

        }
        catch (ClassNotFoundException | SQLException e) 
        { 
    }

        // TODO code application logic here
    }
    
}
