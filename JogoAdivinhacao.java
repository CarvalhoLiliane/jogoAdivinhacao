package adivinhacao;

import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroOculto = (int)(Math.random() * 21);
		System.out.println("Adivinhe o n�mero que est� oculto entre 0 e 20");
		int numero = entrada.nextInt();
		while(numero != numeroOculto) {
			System.out.println("Voc� errou. Tente novamente!");
			numero = entrada.nextInt();
		}
		System.out.println("Parab�ns, voc� acertou!");
		System.out.println("O n�mero oculto � " + numeroOculto);
		
		
		
		entrada.close();

	}

}
