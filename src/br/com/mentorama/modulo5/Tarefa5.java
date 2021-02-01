package br.com.mentorama.modulo5;

public class Tarefa5 {

	public static void main(String[] args) {
        double a = 5;
        double b = 5;
        
        Double c = 5d;
        Double d = 5d;
        
        Integer salary;
        int salary1;
               
       System.out.printf ("%s%n","-- OBJETOS WRAPPERS --");
       System.out.println("Comparando com EQUALS"+" "+c.equals(d)); //comparando os objetos se seu conteudo é igual.
       System.out.println("Comparando com operador logico = ="+" "+(d == c));//aqui compara o valor de memoria por isso da false
       
       System.out.printf ("%s%n","-- PRIMITIVOS --");
       System.out.println("Valores primitivos não permite usar equals pois não é um objeto"); 
       System.out.println("Comparando com operador logico = ="+" "+(a == b));//aqui compara o valor em memoria

	}

}
