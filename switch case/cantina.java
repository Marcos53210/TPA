package exerciciosSwichtCase;
import java.util.Scanner;
public class cantina {

	public static void main(String[] args) {
Scanner leitura = new Scanner (System.in);
		
		int cod;
		System.out.println ("Escreva o codigo do produto");
		cod = leitura.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println ("cachorro quente custando 8 reais");
			break;
		case 2:
			System.out.println ("Cheeseburger custando 12 reais");
			break;
		case 3:
			System.out.println ("X-Salada custando 15 reais");
			break;
		case 4:
			System.out.println ("Misto Quente custando 11 reais");
			break;
		case 5:
			System.out.println ("pão na chapa custando 6 reais");
			break;
		default:
			System.out.println ("codigo invalido"); 
		leitura.close();	
		}
		

	}

	}


