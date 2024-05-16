package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("digite o segundo numero");
		String valor3 = JOptionPane.showInputDialog("digite o terceiro numero");
		
		
		System.out.println(valor1 + valor2+ valor3);
		
		Double numero1 = Double.parseDouble(valor1);
		Double numero2 = Double.parseDouble(valor2);
		Double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 +numero3 ;
		System.out.println("A soma é:" + soma );
		System.out.println("A média é:" + soma/2);
	}
}
