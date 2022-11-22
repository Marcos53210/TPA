import java.util.Scanner;
public class parOuNao {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int i, a[], b[];
		
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [10];
		
		for (i=0;i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ ".o numero");
			a[i] = in.nextInt();
			if(a[i] % 2 ==0){
				b[i] = a[i];
			}
			
		}
		
			for(i=0; i<TAM; i++) {
				if (i==0) {
					System.out.print("A = ["+a[i]+" ");

				}else if (i==(TAM-1)) {
					System.out.println(a[i]+"]");
				}else {
					System.out.print(a[i]+" ");
				}
			}
		System.out.println();
		
		for (i=0;i<TAM; i++) {
			if (i==0) {
				System.out.print("B = ["+a[i]+" ");

			}else if (i==(TAM-1)) {
				System.out.println(b[i]+"]");
			}else {
				System.out.print(b[i]+" ");
			}
			
		}
		
  


	}

}
