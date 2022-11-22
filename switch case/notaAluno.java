package exerciciosSwichtCase;
import java.util.Scanner;
public class notaAluno {

	public static void main(String[] args) {
Scanner leitura = new Scanner (System.in);
		
		double alunos, mb, b, r, i, mbp, bp, rp, ip;
		String nota;
		
		System.out.println("Informe a quantidade de alunos na sala");
		alunos = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram MB");
		mb = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram B");
		b = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram R");
		r = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram I");
		i = leitura.nextInt();
		
		mbp = mb/alunos*100;
		bp = b/alunos*100;
		rp = r/alunos*100;
		ip = i/alunos*100;
		
		if((mb+b+r+i)>alunos||(mb+b+r+i)<alunos) {
			System.out.println("Quantidade de alunos incorreta");
		}
		else {
			System.out.println("Insira a nota que deseja saber a porcentagem");
			nota = leitura.next();
			
			switch(nota) {
			case "mb":
				System.out.println("A porcentagem de alunos que tirou MB é de: "+mbp);
				break;
			case "b":
				System.out.println("A porcentagem de alunos que tirou B é de: "+bp);
				break;
			case "r":
				System.out.println("A porcentagem de alunos que tirou R é de: "+rp);
				break;
			case "i":
				System.out.println("A porcentagem de alunos que tirou I é de: "+ip);
				break;
			default:
				System.out.println("Nota invalida");
			leitura.close();	
			}
		}

	}



		
}
