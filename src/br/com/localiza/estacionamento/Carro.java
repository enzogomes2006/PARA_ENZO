package br.com.localiza.estacionamento;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String placa, String marca, String modelo,
                 int anoFabricacao, int quantidadePortas) {
        super(placa, marca, modelo, anoFabricacao);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Carro");
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + this.quantidadePortas);
    }
}
