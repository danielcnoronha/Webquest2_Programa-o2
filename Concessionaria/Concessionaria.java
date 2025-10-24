/**
 * -------------------------------------------
 * SISTEMA DE CONCESSIONÁRIA DE VEÍCULOS
 * -------------------------------------------
 * Disciplina: Programação II
 * 
 * 
 * Equipe:
 * - Daniel Cavalcanti Noronha
 * - Alberto Silva
 * - Bernardo Cardoso
 * - Cauã Lucas
 * - Davi Spindola
 */

import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        // Adicionando carros
        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2020, 95000.00, 4));
        veiculos.add(new Carro("XYZ-9876", "Honda", "Civic", 2022, 130000.00, 4));
        veiculos.add(new Carro("JKL-5678", "Chevrolet", "Onix", 2021, 78000.00, 4));

        // Adicionando motos
        veiculos.add(new Moto("MNO-1111", "Yamaha", "MT-03", 2023, 34000.00, 321));
        veiculos.add(new Moto("PQR-2222", "Honda", "CB 500F", 2022, 42000.00, 471));

        // Adicionando caminhões
        veiculos.add(new Caminhao("TRK-3333", "Volvo", "FH 540", 2023, 650000.00, 25)); // >5 toneladas
        veiculos.add(new Caminhao("TRK-4444", "Mercedes-Benz", "Accelo 1016", 2021, 250000.00, 4.5)); // ≤5 toneladas

        // Exibindo todas as informações
        System.out.println("===== LISTA DE VEÍCULOS DA CONCESSIONÁRIA =====");

        for (Veiculo v : veiculos) {
            v.exibirInformacoes();
            System.out.println("---------------------------------------------");
        }
    }
}
