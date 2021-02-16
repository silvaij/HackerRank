package br.com.mentorama.modulo7;


public class TestaConta {

	public static void main(String[] args) {
		//Teste da conta poupança		
		ContaPoupanca p1 = new ContaPoupanca(23667-9L,3297,"Itau",80.00,17,0.05);
		p1.depositar(10.00);
		p1.sacar(38.50);
		System.out.println("Saldo da Poupança"+" "+ p1.getSaldo());
		
		//Teste da conta corrente	
		ContaCorrente mario = new ContaCorrente(35876-1,2675,"Santander",232.50, 1000.00);
		mario.depositar(50.00);
		mario.sacar(1500.00);
		mario.depositar(217.50);
		System.out.println("Saldo da Conta Corrente"+" "+mario.getSaldo());
		
		//Teste da conta Salario		
		ContaSalario estagiario = new ContaSalario(6781-1,4191 ,"Caixa_Economica",1100.00,2);
		estagiario.sacar(550.00);
		estagiario.sacar(200.00);
		estagiario.sacar(100.00);
		estagiario.depositar(85.00);
		System.out.println("Saldo da Conta Salario"+" "+ estagiario.getSaldo());
		
	}

	public int GetSum(int a, int b) {
		int maxi = Math.max(a, b);
		int mini = Math.min(a, b);
		int result = 0;

		while (mini <= maxi) {
			result += mini;
			mini++;
		}
		return result;
	}

}
