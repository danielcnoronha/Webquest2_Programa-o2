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

public class Carro extends Veiculo {
    
    private int numeroPortas;

    
    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
      
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

  
    @Override
    public double calcularIpva() {
        return getValor() * 0.035; 
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
        System.out.println("IPVA (3.5%): R$ " + calcularIpva());
    }
}
