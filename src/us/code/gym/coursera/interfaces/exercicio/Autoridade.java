package us.code.gym.coursera.interfaces.exercicio;

public class Autoridade  {
    String nome;
    String sobrenome;
    FormatadorDeNome padrao;        
    
    public void getTratamento(Informal padrao) {   	
    	 padrao.formatarNome(nome, sobrenome);
    }
    
    public void getTratamento(Respeitoso padrao) {   	
    	 padrao.formatarNome(nome, sobrenome);
    }
    
    public void getTratamento(ComTitulo padrao) {   	
    	 padrao.formatarNome(nome, sobrenome);
    }
    
    
    public static void main(String[]args) {
    	Informal informal =  new Informal();
    	Respeitoso respeitoso = new Respeitoso(false);
    	ComTitulo titulo = new ComTitulo("Majestrado");
    	 	
    	System.out.println(titulo.formatarNome("Isaque", "José da Silva"));	
    	System.out.println(informal.formatarNome("Isaque", "José da Silva"));
    	System.out.println(respeitoso.formatarNome("Isaque", "José da Silva"));
    	
    }
	
}
