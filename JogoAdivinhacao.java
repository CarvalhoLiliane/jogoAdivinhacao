package adivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroOculto = (int)(Math.random() * 21);
		System.out.println("Adivinhe o número que está oculto entre 0 e 20");
		int numero = entrada.nextInt();
		while(numero != numeroOculto) {
			System.out.println("Você errou. Tente novamente!");
			numero = entrada.nextInt();
		}
		System.out.println("Parabéns, você acertou!");
		System.out.println("O número oculto é " + numeroOculto);
		
		
		
		entrada.close();

	}

}
