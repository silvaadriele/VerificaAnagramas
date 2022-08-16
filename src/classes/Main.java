package classes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite a palavra 1: ");
		String palavra1 = entrada.nextLine();
		System.out.println("Por favor, digite a palavra 2: ");
		String palavra2 = entrada.nextLine();
		
		
		char[] arrayDa1 = palavra1.toCharArray();
		char[] arrayDa2 = palavra2.toCharArray();
		
		Arrays.sort(arrayDa1);
		Arrays.sort(arrayDa2);
		
		if (Arrays.equals(arrayDa2, arrayDa1))
			System.out.println("É anagrama.");
		else
			System.out.println("Não é anagrama.");
	}
}
