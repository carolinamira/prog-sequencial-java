package lacosrepeticao;

import java.util.Scanner;

//Exercício 2 - Laços de repetição
//Carolina Mira

public class Repeticao2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int x, numero, par=0, impar=0;
		Scanner entrada = new Scanner(System.in);

		for(x=0; x<10; x++) {
			
			System.out.println("Digite o número "+ (x+1) +": ");
			numero = entrada.nextInt();
			
			if(numero%2 == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		
		System.out.println("Você digitou " + par + " números pares, e " + impar + " números ímpares.");
		
	}
}
