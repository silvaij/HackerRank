package br.com.mentorama.modulo7;

public class Cliente extends Usuario {
    public Cliente (String nome){
        super(nome , TipoUsuario.CLIENTE);
    }
}
