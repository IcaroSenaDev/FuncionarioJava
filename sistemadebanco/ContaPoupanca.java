package sistemadebanco;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void extrato() {
        double rendimento = getSaldo() * taxaRendimento;
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Rendimento mensal estimado: R$ " + rendimento);
        System.out.println("Saldo + rendimento: R$ " + (getSaldo() + rendimento));
    }
}

