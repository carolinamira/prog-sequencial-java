package rev_lacosearrays;

import java.util.Scanner;

//Exerc�cio 1 - Revis�o La�os e Arrays
//Carolina Mira

public class Exercicio1 {

		public static void main(String[] args) {
			
			double preco;
			int option;
			
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o pre�o do produto a ser comprado: ");
			preco = entrada.nextDouble();
			
			System.out.println("**Condi��es de Pagamento - Escolha uma op��o: **");
			System.out.println("1 -- � vista, dinheiro ou cheque (20% desconto)\n2 -- � vista no cart�o de cr�dito (15% de desconto)\n3 -- em 2x (pre�o normal sem juros)\n4 -- em 3x (pre�o normal com juros de 10%)");
			option = entrada.nextInt();
			if(option < 1 || option > 4) {
				System.out.println("Op��o inv�lida! Escolha novamente.");
				option = entrada.nextInt();
			}
			
			switch(option) {
			
			case 1:
			System.out.println("Op��o 1 escolhida: � vista, dinheiro ou cheque (20% desconto).");
			preco = preco - (preco*0.2);
			System.out.println("O pre�o final �: " + preco);
			break;
			
			case 2:
			System.out.println("Op��o 2 escolhida: � vista no cart�o de cr�dito (15% de desconto).");
			preco = preco - (preco*0.15);
			System.out.println("O pre�o final �: " + preco);
			break;
			
			case 3:
			System.out.println("Op��o 3 escolhida: em 2x (pre�o normal sem juros).");
			System.out.println("O pre�o final �: " + preco);	
			break;
			
			case 4:
			System.out.println("Op��o 4 escolhida: em 3x (pre�o normal com juros de 10%).");
			preco = preco + (preco*0.1);
			System.out.println("O pre�o final �: " + preco);	
			break;
						
			}
	  }
}
