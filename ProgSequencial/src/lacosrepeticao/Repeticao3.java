package lacosrepeticao;

import java.util.Scanner;

//Exerc�cio 3 - La�os de repeti��o
//Carolina Mira

public class Repeticao3 {
	
	//condi��o para sair do while: idade = -99
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int idade, menor=0, maior=0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma idade: ");
		idade = entrada.nextInt();	
		
		while(idade!=-99) {
			
			if(idade < 21) {
				menor++;
			} else if(idade > 50) {
				maior++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = entrada.nextInt();
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: " + menor);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior);
		
	}
}
