package com.rank.hacker.solution;

import javax.swing.JOptionPane;

public class PrecoMedioBombom {

	public static void main(String[] args) {
		double cxDeBomBom1 = 5;
		double cxDeBomBom2 = 8;
		double cxDeBomBom3 = 12;
		
		double media = (cxDeBomBom1+cxDeBomBom2+cxDeBomBom3)/3;
		media = Math.round(media);
		
		JOptionPane.showMessageDialog(null, "Media de Venda:"+" "+media);
				
	}

}
