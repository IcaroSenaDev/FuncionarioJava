package sistemafuncionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario, String matricula) {
        super(nome, salario, matricula);
    }

    public double calcularSalario() {
    	
        return getSalario() * 1.10;
    }
}
