package exerciciosVetor;
import java.util.Scanner;
public class numeroPar {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int i, a[], b[],numPar=0;
		
		final int TAM = 5;
		
		a = new int [TAM];
		
		
		for (i=0;i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ ".o numero");
			a[i] = in.nextInt();
			
			
		}
		if(i==TAM) {
		
			for(i=0; i<TAM; i++) {
				if (a[i]%2==0) {
					System.out.print(a[i]+ " e par, ");
					numPar++;
				
			}
		}
		
			
		
		System.out.println(" ");
		System.out.println("Ha "+numPar+ " numeros pares");
		
		
	}

	}
}
