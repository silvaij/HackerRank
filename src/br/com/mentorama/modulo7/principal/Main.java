package br.com.mentorama.modulo7.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.mentorama.modulo7.Admin;
import br.com.mentorama.modulo7.Usuario;
import br.com.mentorama.modulo7.UsuariosDB;
import br.com.mentorama.modulo7.models.*;

public class Main {
    
	public static void main(String[] args) throws Exception {
		String prod = null;
		Integer id = 0;
		Produto produto = new Produto(id,prod);
		UsuariosDB usuariosDB = new UsuariosDB();
	    
	    BufferedReader entradaDeDados = new BufferedReader(new InputStreamReader(System.in));
	    /*System.out.printf("%s%n", "INSIRA DESCRICAO DO PRODUTO");
	    prod = entradaDeDados.readLine();
	    produto.setDescricao(prod);
	   
	    
	    System.out.printf("%s%n", "INSIRA O ID DO PRODUTO");
	    id = Integer.parseInt(entradaDeDados.readLine());
	    produto.setId(id);
	    
	    System.out.printf("%s%n", "Produto Registrado");
	    System.out.print(produto.getId());
	    System.out.printf("- %1s",produto.getDescricao());*/

	    System.out.println("Informe o usuario ADMINISTRADOR");
	    String nomeDoUsuario = entradaDeDados.readLine();
	    Admin novoAdmin = new Admin(nomeDoUsuario);
	    usuariosDB.addNovoUsuario(novoAdmin);

	    usuariosDB.getUsuarioList().
				forEach(usuario ->
				{
					System.out.println(usuario.getId()+" "+usuario.getNome());
				});

	}
	
}
