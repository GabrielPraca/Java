package DAO.Interface;
import Model.User;

public interface IUserDAO
{
    public User getUser(String userID, java.sql.Connection con) throws Exception;
    public boolean addUser(User user, java.sql.Connection con) throws Exception;    
    public boolean UpdateUser(User user,  java.sql.Connection con) throws Exception;
            
    public boolean RemoveBalance(float value, String UserID,  java.sql.Connection con) throws Exception;
    public boolean IncrementBalance(float value, String UserID,  java.sql.Connection con) throws Exception;
}
