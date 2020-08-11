package lacosrepeticao;

import java.util.Scanner;

//Exercício 5 - Laços de repetição
//Carolina Mira

public class Repeticao5 {
	
	//condição para sair do "do while": numero = 0
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero, soma=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();	
		
		do {
			soma = soma + numero;
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
		} while(numero != 0);
		
		System.out.println("Soma dos números digitados: " + soma);		
	}
}
