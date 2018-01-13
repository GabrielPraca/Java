public interface EmpregadoDAO
{
	public Empregado getEmpregado(String nome ) throws Exception;
	public boolean  addEmpregado(Empregado e) throws Exception;
}
