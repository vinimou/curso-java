package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		//tipos numericos inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos = 32767;
		int id = 5678;
		long pontosAcumulados = 1_234_845_223L;
		
		
		
		//tipos numericos reais 
		float salario =11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo boobleano
		boolean estaDeFerias = false;
		
		
		//tipo de caractere 
		char status ='a';		
		
		//Dias de empresa		
		System.out.println(anosDeEmpresa* 365);
		
		
		//Numeros de viagem 
		System.out.println(numeroDeVoos/2);
		
		
		//Pontos por real
		
		System.out.println( pontosAcumulados / vendasAcumuladas );		
		System.out.println(id + ":ganha -> " + salario);		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status:"+ status);
		
	}

}
