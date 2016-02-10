import java.util.Scanner;

public class Ej2For {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Programa de impresion numeros del 1 hasta el numero indicado
		int num=0;

		System.out.println("Ingrese un numero");
		num = lea.nextInt();

		for (int cont=1;cont<=num;cont++ ) {
			System.out.println(cont);
		}
		
		//Renan Zelaya
	} 
}