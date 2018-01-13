
package DAO.Interface;

import Model.ExpenseType;
import java.util.List;

public interface IExpenseTypeDAO
{
    public ExpenseType getExpenseTypeByID(int expenseTypeID, java.sql.Connection con) throws Exception;
    public List<ExpenseType> getAllExpenseType(java.sql.Connection con) throws Exception;
}
