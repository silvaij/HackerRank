package us.code.gym.coursera.interfaces.implementacoes;

public class Testadora_Principal {

	public static void main(String[] args) {
		Barulhento barulhentos[] = new Barulhento[5];
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Carro();
		barulhentos[2] = new Bateria();
		barulhentos[3] = new Cachorro();
		
		emitirSons(barulhentos);

	}
	
	public static void emitirSons(Barulhento[] barulhentos) {
		for(int i= 0 ; i<=barulhentos.length-1; i++) {
			if(barulhentos[i] == null) {
				break;
			}else {
				System.out.println(barulhentos[i].fazerBarulho());
			}		
		}
	}

}
