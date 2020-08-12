package lacosrepeticao;

import java.util.Scanner;

//Exercício 4 - Laços de repetição
//Carolina Mira

public class Repeticao4 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int idade, genero, option, contador=0, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Sistema de classificação de pessoas. Caso queira sair, digite 9.");
		
		while(contador < 149) {
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			if(idade<=0) {
				System.out.println("Idade inválida! Digite sua idade: ");
				idade = entrada.nextInt();
			}
			System.out.println("Escolha uma opção: 1-> gênero feminino, 2-> gênero masculino, 3-> outros gêneros.");
			genero = entrada.nextInt();
			if(genero<1 && genero>3) {
				System.out.println("Opção inválida! Escolha entre 1, 2 ou 3: ");
				genero = entrada.nextInt();
			}
			System.out.println("Você se considera uma pessoa: 1-> calma, 2-> nervosa, 3-> agressiva.");
			option = entrada.nextInt();
			if(option<1 && option>3) {
				System.out.println("Opção inválida! Escolha entre 1, 2 ou 3: ");
				option = entrada.nextInt();
			}
			
			if(option == 1) {
				cont1++;
			}
			if(genero == 1 && option == 2) {
				cont2++;
			}
			if(genero == 2 && option == 3) {
				cont3++;
			}
			if(genero == 3 && option == 1) {
				cont4++;
			}
			if(option == 2 && idade > 40) {
				cont5++;
			}
			if(option == 1 && idade < 18) {
				cont6++;
			}
			
			contador++;
		}
		
		System.out.println("**Sistema de classificação de pessoas**");
		System.out.println("\nNúmero de pessoas calmas: " + cont1);
		System.out.println("Número de mulheres nervosas: " + cont2);
		System.out.println("Número de homens agressivos: " + cont3);
		System.out.println("Número de outros calmos: " + cont4);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + cont5);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + cont6);
	}
}
