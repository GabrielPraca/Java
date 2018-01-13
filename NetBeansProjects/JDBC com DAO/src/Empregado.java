
public class Empregado {
	String rg;
	String cpf;
	String nome;
	float salario;
	int idade;
	String sexo;
 
 

	public Empregado (String rg, 
			         String cpf, 
			         String nome, 
			         float salario,
			         int idade,
			         String sexo){
		
	    	 this.rg = rg;
	    	 this.cpf =cpf;
	    	 this.nome = nome;
	    	 this.salario = salario;
	    	 this.idade = idade;
	    	 this.sexo = sexo ;
 
	     }
	
	
	public String getRG(){
		return rg;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCPF(){
		return cpf;
	}
	
	public int getIdade(){
		return idade;
	}
	
	
	public float getSalario(){
		return salario;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalario(float salario){
		this.salario = salario;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	} 
	
	 
	     
}
