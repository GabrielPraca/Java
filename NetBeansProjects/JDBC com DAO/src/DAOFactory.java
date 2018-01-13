
public class  DAOFactory {
  
    public static EmpregadoDAO getEmpregadoDAO() throws Exception{
	return new EmpregadoDAOMySQL();
  }
}
