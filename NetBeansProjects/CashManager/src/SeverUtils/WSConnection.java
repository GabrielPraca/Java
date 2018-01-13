package SeverUtils;

import java.sql.DriverManager;
import java.sql.SQLException;

public class WSConnection {
    
    java.sql.Connection con;
    
    public void SetConnection() throws Exception
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
           throw new Exception("Driver MySQL não encontrado");	
    	}
         
        try
        {
            con = DriverManager.getConnection 
               ("jdbc:mysql://localhost/cashmanager", "root","1234");
        }
        catch (SQLException e)
        {
            throw e;
            //throw new Exception("Falha de conexão ");	
       	}
    }
    
    public java.sql.Connection GetConnection()
    {
        return con;
    }
}
