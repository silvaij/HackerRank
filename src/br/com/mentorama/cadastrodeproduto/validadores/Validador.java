package br.com.mentorama.cadastrodeproduto.validadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Validador {
    private final List<String> errors = new ArrayList<>();

   public abstract boolean ehValido();

   public List<String> getErrors(){
       return errors;
   }

   public void addErrors(String erro){
       this.errors.add(erro);
   }

}
