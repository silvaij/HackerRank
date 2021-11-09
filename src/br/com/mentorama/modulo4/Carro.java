package br.com.mentorama.modulo4;

public class Carro {
	public static final String VERMELHO = "vermelho";
	public static final String PRETA = "preta";

	private Integer quantidadePortas;
	private Integer quantidadePneus;
	private Integer quantidadeCalotas;
	private Integer quantidadeParafusosPneu;
	private String numChassi;
	private String fabricante;
	private String modelo;
	private Integer anoDeFabricacao;
	private String tipoDeCombustivel;
	private String corDoVeiculo;

	public Carro(Integer quantidadePortas, String modelo, String fabricante, Integer anoDeFabricacao, String numChassi,
			String tipoDeCombustivel) {
		setQuantidadePortas(quantidadePortas);
		setModelo(modelo);
		setFabricante(fabricante);
		setAnoDeFabricacao(anoDeFabricacao);
		setNumChassi(numChassi);
		setTipoDeCombustivel(tipoDeCombustivel);
	}

	private void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	private Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	public Integer getQuantidadePneus() {
		return quantidadePneus + 1;
	}

	public void setQuantidadePneus(Integer quantidadePneus) {
		quantidadeCalotas = quantidadePneus;
		quantidadeParafusosPneu = quantidadePneus * 4;
		this.quantidadePneus = quantidadePneus;
	}

	public Integer getQuantidadeCalotas() {
		return quantidadeCalotas;
	}

	public void setQuantidadeCalotas(Integer quantidadeCalotas) {
		this.quantidadeCalotas = quantidadeCalotas;
	}

	public Integer getQuantidadeParafusosPneu() {
		return quantidadeParafusosPneu;
	}

	public void setQuantidadeParafusosPneu(Integer quantidadeParafusosPneu) {
		this.quantidadeParafusosPneu = quantidadeParafusosPneu;
	}

	public String getNumChassi() {
		return numChassi;
	}

	public void setNumChassi(String numChassi) {
		this.numChassi = numChassi;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public String getCorDoVeiculo() {
		return corDoVeiculo;
	}

	public void setCorDoVeiculo(String corDoVeiculo) {
		this.corDoVeiculo = corDoVeiculo;
	}

	public void imprimeValores() {
		System.out.println("Quantidade Portas:" + " = " + getQuantidadePortas());
		System.out.println("Cor do ve�culo :" + " = " + getCorDoVeiculo());
		System.out.println("Numero do Chassi:" + " = " + getNumChassi());
		System.out.println("Modelo:" + " = " + getModelo());
		System.out.println("Fabricante:" + " = " + getFabricante());
		System.out.println("Ano:" + " = " + getAnoDeFabricacao());
		System.out.println("Combustivel:" + " = " + getTipoDeCombustivel());
	}
}
