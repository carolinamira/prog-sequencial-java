package rev_lacosearrays;

import java.util.Scanner;

//Exercício 1 - Revisão Laços e Arrays
//Carolina Mira

public class Exercicio1 {

		public static void main(String[] args) {
			
			double preco;
			int option;
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o preço do produto a ser comprado: ");
			preco = entrada.nextDouble();
			
			System.out.println("**Condições de Pagamento - Escolha uma opção: **");
			System.out.println("1 -- à vista, dinheiro ou cheque (20% desconto)\n2 -- à vista no cartão de crédito (15% de desconto)\n3 -- em 2x (preço normal sem juros)\n4 -- em 3x (preço normal com juros de 10%)");
			option = entrada.nextInt();
			if(option < 1 || option > 4) {
				System.out.println("Opção inválida! Escolha novamente.");
				option = entrada.nextInt();
			}
			
			switch(option) {
			
			case 1:
			System.out.println("Opção 1 escolhida: à vista, dinheiro ou cheque (20% desconto).");
			preco = preco - (preco*0.2);
			System.out.println("O preço final é: " + preco);
			break;
			
			case 2:
			System.out.println("Opção 2 escolhida: à vista no cartão de crédito (15% de desconto).");
			preco = preco - (preco*0.15);
			System.out.println("O preço final é: " + preco);
			break;
			
			case 3:
			System.out.println("Opção 3 escolhida: em 2x (preço normal sem juros).");
			System.out.println("O preço final é: " + preco);	
			break;
			
			case 4:
			System.out.println("Opção 4 escolhida: em 3x (preço normal com juros de 10%).");
			preco = preco + (preco*0.1);
			System.out.println("O preço final é: " + preco);	
			break;
						
			}
	  }
}
