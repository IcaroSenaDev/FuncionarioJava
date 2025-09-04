package sistemafuncionario;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salario, String matricula, double totalVendas) {
        super(nome, salario, matricula);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double calcularSalario() {
        double comissao = totalVendas * 0.05;
        return getSalario() + comissao;
    }
}

