package lacosrepeticao;

import java.util.Scanner;

//Exercício 6 - Laços de repetição
//Carolina Mira

public class Repeticao6 {
	
	//condição para sair do "do while": numero = 0
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero, soma=0, contador=0;
		float media=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			if(numero%3 == 0) {
				soma = soma + numero;
				contador++;
			}
			
		} while(numero != 0);
		
		media = soma/(contador-1);
		System.out.println("Média dos números múltiplos de 3: " + media);		
	}
}
