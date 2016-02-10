import java.util.Scanner;

public class Ej3For {
	public static void main(String args[]){

		Scanner lea = new Scanner (System.in);
//Suma y Promedio de 10 numeros ingresados
		double num=0, memoria=0;
		for (int cont=1;cont<=10 ;cont++ ) {
			System.out.print("Ingrese un numero: ");
			num = lea.nextDouble();
			memoria = memoria+num;
		}
		System.out.println ("La suma de sus numeros es: "+memoria);
		System.out.println ("El promedio de sus numeros es: "+memoria/10);
	
		//Renan Zelaya
	} 
}