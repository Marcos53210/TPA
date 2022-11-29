package apostilaEX;
import java.util.Scanner;
public class NomeEidade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
			
			int anoAtual,idade,anoNasc,i = 1,idadeV,idadeN;
			String nome,nome1;
			
			System.out.println("digite o ano atual");
			anoAtual = ler.nextInt();
		
				
			System.out.println("digite o ano de nascimento do "+ i + "° usuario");
			anoNasc =	ler.nextInt();
			System.out.println("digite o nome do "+i+ "° usuario");
			nome=ler.next();
				
			idade = (anoAtual-anoNasc);
			idadeV = idade;
			idadeN = idade;
		
			for(i = 2;i<= 4;i++) {
				System.out.println("digite o ano de nascimento do "+ i + "° usuario");
				anoNasc =	ler.nextInt();
				System.out.println("digite o nome do "+i+ "° usuario");
				nome=ler.next();
				idade = (anoAtual-anoNasc);
				if(idade < idadeN) {
					idadeN = idade;
				}else if(idade > idadeV) {
					idadeV = idade;
					
					
			}
			System.out.println("O nome do mais novo é " +nome+ " e ele tem " +idadeN+ " anos" );
			System.out.println("O nome do mais velho é " +nome+ " e ele tem " +idadeV+ " anos");
			ler.close();
			}

		


	


	}


