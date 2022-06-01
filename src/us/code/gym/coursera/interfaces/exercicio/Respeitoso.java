package us.code.gym.coursera.interfaces.exercicio;

public class Respeitoso  implements FormatadorDeNome {
	private boolean masculino;

	public Respeitoso(boolean masculino) {
		this.masculino = masculino;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (masculino) {
			return "Sr " + sobrenome;
		} else {
			return "Sra " + sobrenome;
		}

	}
}
