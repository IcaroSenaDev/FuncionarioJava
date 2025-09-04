package sistemafuncionario;

public class Funcionario {
	public String nome;
	public double salario;
	public String matricula;
	
	
	public Funcionario(String nome, double salario, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
