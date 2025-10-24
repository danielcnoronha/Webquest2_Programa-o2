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

public class Moto extends Veiculo {
    
    private int cilindradas;


    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor); (Veiculo)
        this.cilindradas = cilindradas;
    }

    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    
    @Override
    public double calcularIpva() {
        return getValor() * 0.025;
    }

    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Cilindradas: " + cilindradas + " cc");
        System.out.println("IPVA (2.5%): R$ " + calcularIpva());
    }
}
