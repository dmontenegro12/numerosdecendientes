package mycompany.eggcoperation.numerosdecendientes;

import java.util.Scanner;

public class numerosDecendientes {

	public static void main(String[] args) {
	int num,aux,sum=0;
		Scanner imput = new Scanner(System.in);
	System.out.println("Ingresa los numeros que quieres que decaigan");
	num = imput.nextInt();

		for(int i =0; i < num ; i++) {
			System.out.println("IMPRIME "+i);
			
			if(num>0) {
				aux=num;
				sum=aux+num;
			}
		}System.out.println("Imprime numeros sumados "+ sum);
	
	
	

	}

}
