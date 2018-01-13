
package DAO.Interface;

import Model.Expense;
import java.util.List;

public interface IExpenseDAO
{
    public List<Expense> getExpenseByUserID(String userID, java.sql.Connection con) throws Exception;
    public boolean addExpense(Expense expense, java.sql.Connection con) throws Exception;    
    public boolean removeExpenseByID(int expenseID, java.sql.Connection con) throws Exception;
}
