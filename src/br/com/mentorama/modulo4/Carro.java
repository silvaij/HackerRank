package br.com.mentorama.modulo4;

public class Carro {
	public static final String VERMELHO = "vermelho";
	public static final String PRETA = "preta";

	private Integer quantidadePneus;
	private Integer quantidadeCalotas;
	private Integer quantidadeParafusosPneu;
	private String potenciaMotor;
	private String fabricante;
	private String modelo;
	private Integer anoDeFabricacao;

	public Carro(Integer quantidadePneus,String modelo,String fabricante,Integer anoDeFabricacao,String potenciaMotor) {
		setQuantidadePneus(quantidadePneus);
		setModelo(modelo);
		setFabricante(fabricante);
		setAnoDeFabricacao(anoDeFabricacao);
		setPotenciaMotor(potenciaMotor);
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

	public void setCor(String cor) {
		System.out.println(cor);
	}

	public String getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(String potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
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

	public Integer getAnoDeFabricação() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(Integer anoDeFabricação) {
		this.anoDeFabricacao = anoDeFabricação;
	}

	public void imprimeValores() {
		System.out.println("Quantidade Pneus:" + " = " + getQuantidadePneus());
		System.out.println("Quantidade de Calotas:" + " = " + getQuantidadeCalotas());
		System.out.println("Quantidade de Parafusos:" + " = " + getQuantidadeParafusosPneu());
		System.out.println("Modelo:" + " = " +     getModelo());
		System.out.println("Fabricante:" + " = " + getFabricante());
		System.out.println("Ano:" + " = " +        getAnoDeFabricação());
		System.out.println("Motor:" + " = " +      getPotenciaMotor() );
	}
}
