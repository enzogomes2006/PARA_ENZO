package br.com.localiza.estacionamento;

public class Veiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	static int numeroVeiculos;
	
	public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		numeroVeiculos++;
	}
	
	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public static int getNumeroVeiculos() {
		return numeroVeiculos;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public static void setNumeroVeiculos(int numeroVeiculos) {
		Veiculo.numeroVeiculos = numeroVeiculos;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao="
				+ anoFabricacao + "]";
	}
	
}

