
package DAOFactory;

import DAO.Interface.IExpenseDAO;
import DAO.Interface.IUserDAO;
import DAO.UserDAOMySQL;
import DAO.ExpenseDAOMySQL;
import DAO.ExpenseTypeDAOMySQL;
import DAO.Interface.IExpenseTypeDAO;

public class DAOFactory
{
    public static IUserDAO getUserDAO() throws Exception
    {
	return new UserDAOMySQL();
    }
    
    public static IExpenseDAO getExpenseDAO() throws Exception
    {
        return new ExpenseDAOMySQL();
    }
    
    public static IExpenseTypeDAO getExpenseTypeDAO() throws Exception
    {
        return new ExpenseTypeDAOMySQL();
    }
}
