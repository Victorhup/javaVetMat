package javaVetMat;
import java.util.*; 
public class vetor { 
	public static void  main (String args[]) {
		Scanner ler = new Scanner (System.in); 
		int [] vet = new int [6]; 
		int somapar=0, impares=0, x; 
		for (x=0; x<6;x++) 
		{
			System.out.println ("Digite o n�mero");
			vet[x] = ler.nextInt();
			if (vet [x]%2==0) {
				System.out.println("N�mero par: "+vet[x]);
				somapar = somapar+vet[x];
			}
			else {
				System.out.println("N�mero impar: "+vet[x]);
			}
			
		}
		
		System.out.println("Soma dos n�meros pares: "+somapar);
		System.out.println("Quantidade de n�meros �mpar(es)"+impares);
		
	}

}
