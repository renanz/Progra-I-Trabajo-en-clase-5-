import java.util.Scanner;

public class Ej7For {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Factorial numero ingresado
		System.out.println ("Ingrese un numero");
		double num=lea.nextInt();
		double res=1;
		
		for (int cont=1;num>=cont;cont++) {
			res = res * cont;
		}
		System.out.println(res);



	
		//Renan Zelaya
	} 
}