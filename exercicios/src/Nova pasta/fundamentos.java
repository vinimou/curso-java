package fundamentos;

public class Temperatura {
	
	public static void Main (String[] args) {
		
		final double FATOR = 5/9.0;
		final double ajuste = 32;
		
		double fahrenheit = 86;
		
		
		double celsius = (fahrenheit - ajuste)* FATOR;
		
		
		
		System.out.print(celsius);
		
		
		
		
	}

}
