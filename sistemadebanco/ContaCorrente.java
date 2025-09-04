package sistemadebanco;

public class ContaCorrente extends ContaBancaria {
    private double limiteCredito;

    public ContaCorrente(double saldoInicial, double limiteCredito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void extrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Limite de crédito: R$ " + limiteCredito);
        System.out.println("Saldo disponível total: R$ " + (getSaldo() + limiteCredito));
    }
}

