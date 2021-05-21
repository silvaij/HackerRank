package one.digital.innovation.inter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioBasico4 {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    List<String> entradasNum = new  ArrayList<String>();
    
    int cont=1;
    while (cont<6) {
    	String str = br.readLine();
    	entradasNum.add(str);
    	cont++;
    }
    
     Double numero;
     cont=0;
     for (String string : entradasNum) {
    	 String str = string;
    	 if((!str.isEmpty() && str != null)&&(onlyDigits(str))) {		    	
		    	numero =Double.parseDouble(str);
		    	  if(numero>=0) {
		    		  cont++;
		    	  }		    	  
		    }		    
	}
     System.out.println(cont+" valores positivos");
  }   
  
  public static boolean onlyDigits(String str) {
      String regex = "[0.0-9.0]+";
      Pattern padrao = Pattern.compile(regex);
      Matcher combinaStrings = padrao.matcher(str);
      return combinaStrings.matches();
   }
  
}
















