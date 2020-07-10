package javaVetMat;
import java.util.*;
public class matriz { 
	public static void main (String args[]) {{
		Scanner ler = new Scanner (System.in);
		int [][] matriz = new int [3][3];
		int  l=0, c=0, cont=0; 
		for (l=0; l<3;l++)
		{
			for (c=0;c<3;c++) {
				System.out.println("Entre com os números ");
			   matriz [l][c] = (int) ler.nextFloat();
			}
			
			} 
		for(int linha=0; linha<3; linha++)
	        for(int coluna=0; coluna<3; coluna++)
	            if(matriz[linha][coluna] > 10)
	                cont++; 
		System.out.println("Numeros maiores que 10 na matriz: "+cont);
		}
	     	
			
	}


}