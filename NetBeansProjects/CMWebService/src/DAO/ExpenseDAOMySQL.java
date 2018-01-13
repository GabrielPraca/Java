
package DAO;

import DAO.Interface.IExpenseDAO;
import Model.Expense;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAOMySQL implements IExpenseDAO
{
    @Override
    public List<Expense> getExpenseByUserID(String userID, Connection con) throws Exception
    {
        List<Expense> expen = new ArrayList<Expense>();
        
        try
        {
	    String query = "Select * " +
	                   "From expense " +
	                   "where UserID = ?";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);
	    stmt.setString(1, userID);
            
	    ResultSet rs = stmt.executeQuery();
	    while (rs.next())
            {
                Expense expense = new Expense
                (
                    rs.getInt("expenseID"), 
                    rs.getInt("fixedExpenseID"), 
                    rs.getInt("expenseTypeID"), 
                    rs.getString("userID"),
                    rs.getString("locality"),
		    rs.getFloat("cost")
                );
                expen.add(expense);
	    }
            
            return expen;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao consultar usuário!");
	}
    }
    
    public boolean removeExpenseByID(int expenseID, Connection con) throws Exception
    {        
        try
        {
	    String query = "DELETE " +
	                   "FROM expense " +
	                   "where expenseID = ?";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);
	    stmt.setInt(1, expenseID);
            
	    stmt.executeUpdate();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao deletar gasto!");
	}
    }

    @Override
    public boolean addExpense(Expense expense, Connection con) throws Exception
    {        
        try
        {
	    String query = "INSERT " +
	                   "INTO expense " +
	                   "Values " +
                           "(?, ?, ?, ?, ?, ?)";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, getLastID(con) + 1);
            
            if(expense.getFixedExpenseID() == null)
            {
                stmt.setNull(2, Types.INTEGER);
            }
            else
            {
                stmt.setInt(2, expense.getFixedExpenseID());
            }
            
            stmt.setInt(3, expense.getExpenseTypeID());
            stmt.setString(4, expense.getUserID());
            stmt.setString(5, expense.getLocality());
            stmt.setFloat(6, expense.getCost());
	    
	    stmt.executeUpdate();
            stmt.close();
            return true;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao cadastrar gasto!");
	}
    }
    
    private int getLastID(Connection con) throws Exception
    {        
        try
        {
	    String query = "SELECT " +
	                   "MAX(expenseID) " +
	                   "FROM " +
                           "expense";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);
	    
	    ResultSet rs = stmt.executeQuery();
            int res = 0;
            while(rs.next())
            {
                res = rs.getInt(1);
            }
            return res;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao consultar ultimo id da tabela!");
	}
    }
}

