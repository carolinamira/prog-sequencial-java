package lacosrepeticao;

import java.util.Scanner;

//Exerc�cio 5 - La�os de repeti��o
//Carolina Mira

public class Repeticao5 {
	
	//condi��o para sair do "do while": numero = 0
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero, soma=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero = entrada.nextInt();	
		
		do {
			soma = soma + numero;
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
		} while(numero != 0);
		
		System.out.println("Soma dos n�meros digitados: " + soma);		
	}
}
