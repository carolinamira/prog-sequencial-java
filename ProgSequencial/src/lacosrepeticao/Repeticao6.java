package lacosrepeticao;

import java.util.Scanner;

//Exerc�cio 6 - La�os de repeti��o
//Carolina Mira

public class Repeticao6 {
	
	//condi��o para sair do "do while": numero = 0
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero, soma=0, contador=0;
		float media=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			if(numero%3 == 0) {
				soma = soma + numero;
				contador++;
			}
			
		} while(numero != 0);
		
		media = soma/(contador-1);
		System.out.println("M�dia dos n�meros m�ltiplos de 3: " + media);		
	}
}
