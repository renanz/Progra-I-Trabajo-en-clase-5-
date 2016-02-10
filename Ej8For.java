import java.util.Scanner;

public class Ej8For {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Factorial de numeros del 1 al 10
		
		double res=1;
		int num=1;
		for (int cont=1;10>=cont;cont++) {
			res = res * cont;
			System.out.println("Factorial de "+num+" es: "+res);
			num++;
		}
		//Renan Zelaya
	} 
}