package sistemafuncionario;

public class Main {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Ana", 5000.0, "G123");
        
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, "V456", 10000.0);

        System.out.println("Gerente " + gerente.getNome() +
                           " - Salário com bônus: R$ " + gerente.calcularSalario());

        System.out.println("Vendedor " + vendedor.getNome() +
                           " - Salário com comissão: R$ " + vendedor.calcularSalario());
    }
}
