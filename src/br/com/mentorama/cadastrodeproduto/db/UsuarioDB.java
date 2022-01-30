package br.com.mentorama.cadastrodeproduto.db;

import java.util.ArrayList;
import java.util.List;

import br.com.mentorama.cadastrodeproduto.models.User;

public class UsuarioDB {
   private List<User> usuarioList = new ArrayList<>();
   
   public List<User> getUsuarioList(){
	   return usuarioList;
   }
   
   public void addNovoUsuario(User usuario) {
	   int id = usuarioList.size()+1;
	   usuario.setId(id);
	   usuarioList.add(usuario);
   }

   public User getUserbyId(int id){
       return usuarioList.stream()
                  .filter((user -> user.getId() == id))
                  .findFirst()
                  .get();
   }
   
}
