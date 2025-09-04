package sistemadeveiculo;

public class Carro extends Veiculo {
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("Carro " + getModelo() + " (" + getAno() + ") ligado com a chave na ignição!");
    }
}
