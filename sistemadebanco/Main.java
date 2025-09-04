package sistemadebanco;

public class Main {
    public static void main(String[] args) {
     
        ContaBancaria conta1 = new ContaCorrente(1000.0, 500.0);
        ContaBancaria conta2 = new ContaPoupanca(2000.0, 0.02); 
        
        conta1.extrato();
        System.out.println();
        conta2.extrato();

        conta1.depositar(200);
        conta1.sacar(300);
        conta1.extrato();

        System.out.println();
        conta2.depositar(500);
        conta2.extrato();
    }
}

