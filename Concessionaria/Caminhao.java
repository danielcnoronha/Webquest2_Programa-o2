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

public class Caminhao extends Veiculo {
    // Novo atributo exclusivo do Caminhão
    private double capacidadeCarga; // em toneladas

    // Construtor
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getter e Setter
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    // Sobrescrevendo o método calcularIpva()
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02; // 2%
        } else {
            return getValor() * 0.03; // 3%
        }
    }

    // Sobrescrevendo exibirInformacoes()
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // chama da classe Veiculo
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("IPVA calculado: R$ " + calcularIpva());
    }
}
