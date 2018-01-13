
import java.sql.*; 
import java.util.Scanner;
public class Main {
        
        public static void main(String[] args) {
        
         Connection con;
         String nome;
         String rg ;
         String cpf ;
         float sal ;
         String sx ;
         int id ;
        

         try{
             Class.forName("com.mysql.jdbc.Driver");
         }
         catch (ClassNotFoundException e) {
    		System.out.println("Driver MySQL não encontrado");
    		e.printStackTrace();
    		return;
    	}
         
         
        try{
            con = DriverManager.getConnection 
               ("jdbc:mysql://187.72.87.219/empresa", "aluno","aluno"); 
        }
        catch (SQLException e) {
       		System.out.println("Falha de Conexão ");
       		e.printStackTrace();
       		return;
       	}
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Programa sem DAO");
        System.out.println("Digite o Nome procurado->");
        nome = sc.nextLine();
        sc.close();
        
        String query = "Select * " +
	               "From empregados " +
	               "where Nome like ?";
        
        try{
           PreparedStatement stmt = con.prepareStatement(query);
        
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	nome = rs.getString("Nome");
                rg = rs.getString("RG");
                cpf = rs.getString("CPF");
                sal = rs.getFloat("Salario");
                sx = rs.getString("Sexo");
                id = rs.getInt("Idade");
                
                System.out.println("Cadastro encontrado " + nome);
                System.out.println("RG: " + rg );
                System.out.println("CPF: " + cpf ); 
                System.out.println("Salario: " + sal); 
                System.out.println("Sexo: " + sx ); 
                System.out.println("Idade: " + id ); 
                
            }
            else 
           	 System.out.println("Nome não encontrado");
            
        }
         catch (SQLException e) {
        		System.out.println("Falha de SQL ");
        		e.printStackTrace();
        		return;
         }
     
   }
        
}
    