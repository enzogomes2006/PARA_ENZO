package br.com.localiza.estacionamento;

public class Moto extends Veiculo {

	private int cilindradas;

    public Moto(String placa, String marca, String modelo,
                int anoFabricacao, int cilindradas) {

        super(placa, marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

	@Override
	public String toString() {
		return "Moto [getPlaca()=" + getPlaca() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getAnoFabricacao()=" + getAnoFabricacao() + ", cilindradas=" + cilindradas + "]";
	}


}
