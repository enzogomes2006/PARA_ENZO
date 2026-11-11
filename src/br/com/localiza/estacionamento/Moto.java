package br.com.localiza.estacionamento;

public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, String marca, String modelo,
                int anoFabricacao, int cilindradas) {
        super(placa, marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Moto");
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}
