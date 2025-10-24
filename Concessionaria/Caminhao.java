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

    private double capacidadeCarga; 

  
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

   
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02; 
        } else {
            return getValor() * 0.03; 
        }
    }

   
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("IPVA calculado: R$ " + calcularIpva());
    }
}
