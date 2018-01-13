
package DAO;

import DAO.Interface.IUserDAO;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOMySQL implements IUserDAO
{
    @Override
    public User getUser(String userID, java.sql.Connection con) throws Exception
    {
        try
        {
	    String query = "Select * " +
	                   "From user " +
	                   "where UserID = ?";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);	        
	    stmt.setString(1, userID);
            
	    ResultSet rs = stmt.executeQuery();
	    if (rs.next())
            {
                User user = new User
                (
                    rs.getString("UserID"), 
                    rs.getString("Password"), 
                    rs.getString("UserName"), 
                    rs.getFloat("Salary"),
		    rs.getFloat("Balance")
                );
	        return user;	
	    }
	    else
                return null; 
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao consultar usuário!");
	}
    }

    @Override
    public boolean addUser(User user,  java.sql.Connection con) throws Exception
    {
        try
        {
	    String query = "INSERT INTO user " +
                           "(UserID, Password, UserName, Salary, Balance)" +
	                   "VALUES " +
	                   "(?, ?, ?, 0,0)";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);	        
	    stmt.setString(1, user.getUserID());
            stmt.setString(2, user.getPassword());	        
	    stmt.setString(3, user.getUserID());
            
	    stmt.executeUpdate();
            stmt.close();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao cadastrar usuário!");
	}
    }
    
    @Override
    public boolean UpdateUser(User user,  java.sql.Connection con) throws Exception
    {
        try
        {
	    String query = "UPDATE user " +
                           "SET password = ?, " +
                           "userName = ?, " +
                           "salary = ?, " +
                           "balance = ? " +
                           "WHERE UserID = ?";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);  
            stmt.setString(1, user.getPassword());      
	    stmt.setString(2, user.getUserName());	        
	    stmt.setFloat(3, user.getSalary());            	        
	    stmt.setFloat(4, user.getBalance());     
	    stmt.setString(5, user.getUserID());
            
	    stmt.executeUpdate();
            stmt.close();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao atualizar usuário!");
	}
    }
    
    @Override
    public boolean RemoveBalance(float value, String UserID,  java.sql.Connection con) throws Exception
    {
        try
        {
	    String query = "UPDATE user " +
                           "SET balance = balance -?" +
	                   "WHERE UserID = ? ";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);	        
	    stmt.setFloat(1, value);
            stmt.setString(2, UserID);
            
	    stmt.executeUpdate();
            stmt.close();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao atualizar saldo do usuário!");
	}
    }
    
    @Override
    public boolean IncrementBalance(float value, String UserID,  java.sql.Connection con) throws Exception
    {
        try
        {
	    String query = "UPDATE user " +
                           "SET balance = balance +?" +
	                   "WHERE UserID = ? ";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);	        
	    stmt.setFloat(1, value);
            stmt.setString(2, UserID);
            
	    stmt.executeUpdate();
            stmt.close();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao atualizar saldo do usuário!");
	}
    }
}
