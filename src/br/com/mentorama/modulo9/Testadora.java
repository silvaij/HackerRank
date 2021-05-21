package br.com.mentorama.modulo9;

/* Autor: Isaque Silva
 * Data : 15/05/20221 
 * Objetivo : Aula de INTERFACE FUNCIONAL E EXPRESSÃO LAMBDA
 * Definição : Interface funcional é uma interface que possui pelo menos um método ABSTRATO  
 * Estudo de Caso : Na aula utilizamos a interface Consumer que necessita da implementação de do metodo ACCEPT
 * */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class Testadora {

	public static void main(String[] args) {
		Customer clienteOne   = new Customer("Isaque",   true,  "Palmeiras", 2);
		Customer clienteTwo   = new Customer("Silvana",  false, "Sao Paulo", 5);
		Customer clienteThree = new Customer("Mario",    true,  "Ascaz125",  3);
		Customer clienteFour  = new Customer("Luiz",     false, "Peixe",     4);
		Customer clienteFive  = new Customer("Ana",      true,  "Bolsonaro", 5);
		Customer clienteSix   = new Customer("Iamara",   false, "PalavraComArte", 12);
		Customer clienteSeven = new Customer("Gerson",   true,  "RoboNaVeia",     29);
		Customer clienteEight = new Customer("Gustavo",  true,  "PokemonGo",      15);
		Customer clienteNine  = new Customer("Joseas",   true,  "12anosDeVexame", 7);
		Customer clienteTen   = new Customer("Jefferson",true,  "Estranho",       6);

		// --------------------------------------------------------------------------------------------
		List<Customer> clientes = Arrays.asList(clienteOne, clienteTwo);
		// interface funcional Consumer , toda interface funcional tem um metodo
		// abstrato
		// neste caso : "accept(T)"
		Consumer<Customer> consumer = new Consumer<Customer>() {
			@Override
			public void accept(Customer t) {
				System.out.print(t.getNome() + " " + t.getSenha());
				System.out.println("");
			}
		};// importante " ; " no final da interface
		clientes.forEach(consumer);

		/* exibeCustomer(clienteOne, clienteTwo,clienteThree); */ // Desativado para exercicio
		filtraMaiorQtdCompras(clienteOne, clienteTwo, clienteThree, clienteFour, clienteFive, clienteSix, clienteSeven,
				clienteEight, clienteNine, clienteTen);
		filtraMenorQtdCompras(clienteOne, clienteTwo, clienteThree, clienteFour, clienteFive, clienteSix, clienteSeven,
				clienteEight, clienteNine, clienteTen);
		MediaDeCompras(clienteOne, clienteTwo, clienteThree, clienteFour, clienteFive, clienteSix, clienteSeven,
				clienteEight, clienteNine, clienteTen);
	}

	public static void exibeCustomer(Customer a, Customer b, Customer c) {
		// mesmo metodo acima só que utilizando expressão LAMBDA " -> "
		List<Customer> clientes = Arrays.asList(a, b, c);
		Consumer<Customer> consomeCustomer = (Customer cli) -> {
			System.out.println(cli.getNome() + " " + cli.getSenha());
		};
		clientes.forEach(consomeCustomer);
		// forma mais simplificada
		clientes.forEach(cli -> {
			System.out.println(cli.getNome() + " " + cli.getSenha());
		});
	}

	public static void filtraMaiorQtdCompras(Customer... cliente) {
		List<Customer> clientes = Arrays.asList(cliente);
		Customer gastao = clientes.stream().max(Comparator.comparing(Customer::getQtdCompras))// outra forma de
																								// expressão lambda
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Cliente " + gastao.getNome() + " que mais fez compras total de: " + gastao.getQtdCompras());
	}

	public static void filtraMenorQtdCompras(Customer... cliente) {
		List<Customer> clientes = Arrays.asList(cliente);
		Customer gastao = clientes.stream().min(Comparator.comparing(Customer::getQtdCompras))// outra forma de
																								// expressão lambda
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Cliente " + gastao.getNome() + " que menos fez compras total de: " + gastao.getQtdCompras());
	}

	public static void MediaDeCompras(Customer... cliente) {
		Integer media = 0;
		List<Customer> clientes = Arrays.asList(cliente);
		if (!clientes.isEmpty()){
			for (Customer cli : clientes) {
				Integer compra = cli.getQtdCompras();
				media+=compra;
			}
          media=(int)(media.doubleValue()/clientes.size());
          System.out.println("A media de compras por cliente eh de: "+media);
		}else {
			System.out.println("SEM CLIENTES");
		}
	}
}
