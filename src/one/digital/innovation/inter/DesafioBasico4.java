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
		String entrada = null;
		int TamanhoDaLista = 0;
		int cont = 0;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> entradasNum = new ArrayList<String>();

		entrada = br.readLine();
		StringTokenizer st = new StringTokenizer(entrada, " ");
		while(st.hasMoreTokens()) {
			if(!StringVazia(st.nextToken())) {
				entradasNum.add(st.nextToken());
			}			
		}
		
		ContaPositivos(entradasNum);
	}

	public static boolean StringVazia(String str) {
		if (str.isEmpty()) {
			return true;
		}
		return str.trim().length() == 0;
	}

	public static void ContaPositivos(List<String> numeros) {
		Double positivo = 0.0;
		String str = null;
		Integer contPositivos = 0;
		for (int j = 0; j < numeros.size(); j++) {
			str = numeros.get(j);
			try {
				positivo = Double.parseDouble(str);
				if (positivo >= 0) {
					contPositivos++;
				}
			} catch (NumberFormatException e) {
			}
		}
		System.out.println(contPositivos + " " + "valores positivos");
	}
}
