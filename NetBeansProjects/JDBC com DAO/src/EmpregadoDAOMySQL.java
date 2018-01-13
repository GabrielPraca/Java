
import java.sql.*;

public class EmpregadoDAOMySQL implements EmpregadoDAO {
	     
     
	public Empregado getEmpregado(String nome, Connection con) throws Exception  {
  
        try{
	       String query = "Select * " +
	        	               "From empregados " +
	        	               "where Nome like ?";
	        	 
	       PreparedStatement stmt = con.prepareStatement(query);
	        
	       stmt.setString(1, nome);
	       ResultSet rs = stmt.executeQuery();
	       if (rs.next()) {
	        	 Empregado e = new Empregado (
	        			 rs.getString("RG"), 
	        			 rs.getString("CPF"), 
	        			 rs.getString("Nome"), 
				         rs.getFloat("Salario"),
				         rs.getInt("Idade"),
				         rs.getString("Sexo") );
	        return e;	
	       }
	       else return null; 
	 
	   } catch (SQLException x) {
		   throw new Exception("Falha de SQL ");
	   }
	   
     }
	 
	 
	 public boolean  addEmpregado(Empregado e) throws Exception{
		 return false;
	 }	 
}
