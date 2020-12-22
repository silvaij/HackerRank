package br.com.mentorama.modulo4;
public class Principal {
   
	public static void main(String[]args) {
		Carro carro = new Carro(4,"Gol","Volkswagem",2020,"9VWGE16PX24060831","Flex");
		carro.setCorDoVeiculo(Carro.VERMELHO);
		carro.imprimeValores();	
		Object o =new int[10];		
	}
		
	public Integer num() {
    	return null ;
    } 
}

//public acessivel de qualquer lugar
//private só acessa as variaveis e metodo de dentro da propria classe
//protected mesmo pacote ou herança
//default só acessa via herança
