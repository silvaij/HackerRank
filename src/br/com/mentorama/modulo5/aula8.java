package br.com.mentorama.modulo5;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class aula8 {

	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");/*aqui posso consultar oracle api para ver os formatos*/

        System.out.println(data.getTime());
        
        data.add(Calendar.MONTH,1);
        System.out.println(data.getTime());
        
        data.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(data.getTime());
        
        data.set(Calendar.MONTH, Calendar.AUGUST );
        System.out.println(data.getTime());
        
        System.out.println(formataData.format(data.getTime()));
        
	
	}
	
	

}
