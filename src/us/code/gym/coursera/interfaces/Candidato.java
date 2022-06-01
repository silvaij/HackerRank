package us.code.gym.coursera.interfaces;

public class Candidato implements Comparable<Candidato> {
    // atributos
	private double nota;
	private boolean deficiente = false;
	private int idade;
	
	private Character[] presenca = {'F','P'};

	//Construtor padrão
	public Candidato(double nota, boolean deficiente, int idade) {		
		this.nota = nota;
		this.deficiente = deficiente;
		this.idade = idade;
	}

	@Override //subescrevendo método da interface Comparable
	public int compareTo(Candidato outro) {
		if(nota == outro.getNota()) {
			if(deficiente == outro.isDeficiente()) {
				return idade - outro.getIdade();
			}else {
				if(deficiente)
					return 1;
				else
				   return -1;
			}
		}else {
			return (int)Math.round(nota - outro.getNota()) ;
		}
		
	}
	
	public double getNota() {
		return nota;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Candidato [nota=" + nota + ", deficiente=" + deficiente + ", idade=" + idade + "]";
	}
	
	
	
   
}
