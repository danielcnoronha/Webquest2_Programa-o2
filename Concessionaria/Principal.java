public class Principal {
    public static void main(String[] args) {
        // Teste com um carro
        Carro carro1 = new Carro("XYZ-9876", "Honda", "Civic", 2022, 130000.00, 4);
        carro1.exibirInformacoes();

        System.out.println("---------------------------");

        // Teste com uma moto
        Moto moto1 = new Moto("DEF-5678", "Yamaha", "MT-07", 2023, 48000.00, 689);
        moto1.exibirInformacoes();
    }
}