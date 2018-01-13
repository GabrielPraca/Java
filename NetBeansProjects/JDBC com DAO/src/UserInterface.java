import java.util.Scanner;
 
public class UserInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		String nome;
		Empregado e;
		
	 try {
		 
			// EmpregadoDAO	dao = new EmpregadoDAOMySQL();
			 
			 EmpregadoDAO	dao = DAOFactory.getEmpregadoDAO();
			  
	         Scanner sc = new Scanner( System.in );
	 	     
	         System.out.println("Programa com padrão DAO"); 
	         System.out.println("Digite o Nome Procurado ->");
	         nome = sc.nextLine();
	         sc.close();
	        
	         if ( (e = dao.getEmpregado(nome)) != null){
	        	     System.out.println("Cadastro encontrado " + e.getNome() );
			         System.out.println("RG: " + e.getRG()  );
			         System.out.println("CPF: " + e.getCPF() ); 
			         System.out.println("Salario: " + e.getSalario() ); 
			         System.out.println("Sexo: " + e.getSexo() ); 
			         System.out.println("Idade: " + e.getIdade() );
	         }
	         else 
	        	 System.out.println("Nome n�o encontrado");
        
         }
         catch (Exception ex){
			 System.out.println("Erro: " + ex.getMessage());
		 }
         
         
	}

}
