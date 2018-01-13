/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Interface.IExpenseTypeDAO;
import Model.ExpenseType;
import com.sun.jmx.mbeanserver.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseTypeDAOMySQL implements IExpenseTypeDAO
{
    public ExpenseType getExpenseTypeByID(int expenseTypeID, Connection con) throws Exception
    {
        ExpenseType expenType = new ExpenseType();
        try
        {
	    String query = "Select * " +
	                   "From expensetype " +
	                   "where ExpenseTypeID = ?";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);
	    stmt.setString(1, Util.cast(expenseTypeID).toString());
            
	    ResultSet rs = stmt.executeQuery();
	    while (rs.next())
            {
                ExpenseType expenseType = new ExpenseType
                (
                    rs.getInt("ExpenseTypeID"),  
                    rs.getString("ExpenseTypeName")
                );
                expenType = expenseType;
	    }
            
            return expenType;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao consultar tipo da despesa!");
	}
    }
    @Override
    public List<ExpenseType> getAllExpenseType(Connection con) throws Exception
    {
        List<ExpenseType> expenType = new ArrayList<>();
        try
        {
	    String query = "Select * " +
	                   "From expensetype";
	        	 
	    PreparedStatement stmt = con.prepareStatement(query);            
	    ResultSet rs = stmt.executeQuery();
	    while (rs.next())
            {
                ExpenseType expenseType = new ExpenseType
                (
                    rs.getInt("ExpenseTypeID"),  
                    rs.getString("ExpenseTypeName")
                );
                expenType.add(expenseType);
	    }
            
            return expenType;
	}
        catch (SQLException ex)
        {
            throw new Exception("Falha ao consultar tipo da despesa!");
	}
    }
    
}
