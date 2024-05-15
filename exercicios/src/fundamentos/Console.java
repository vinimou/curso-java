package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Nome: %s%n", "João");
		
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Digite seu nome: ");		
		String Nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");		
		String Sobrenome = entrada.nextLine();
		
		
		System.out.print("Digite sua idade: ");		
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNome = "+ Nome + " "+ Sobrenome);
		
		
		System.out.printf("%s %s tem %d anos.", Nome, Sobrenome, idade);
		
		
		entrada.close();
		
		
		
	}

}
