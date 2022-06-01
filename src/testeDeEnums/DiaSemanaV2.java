package testeDeEnums;

public enum DiaSemanaV2 {
   SEGUNDA(1),// valor da constante 
   TERCA  (2),
   QUARTA (3),
   QUINTA (4),
   SEXTA  (5),
   SABADO (7),
   DOMINGO(8);

	/*
	  @param - valor atributo que representa um dia da semana
	 */
    private int valor;
    DiaSemanaV2(int valor){
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
