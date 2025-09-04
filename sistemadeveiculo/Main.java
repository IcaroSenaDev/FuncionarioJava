package sistemadeveiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota Corolla", 2022);
        Veiculo moto = new Moto("Honda CB 500", 2021);

        // Polimorfismo: mesmo método, comportamentos diferentes
        carro.ligar();
        moto.ligar();
    }
}
