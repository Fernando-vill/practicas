package practicas;

import java.util.Scanner;

public class LecturaDeDatosScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		//cadena
		System.out.println("por favor introdusca una variable: ");
		String cadena=obj.nextLine();
		System.out.println("yo soy el valor de la variable cadena: "+ cadena);
		//entero
		System.out.println("favor introdusca un numero entero: ");
		int entero=obj.nextInt();
		System.out.println("yo soy el numero entero: "+entero);
		//doble
		System.out.println("favor introdusca un numero doble: ");
		double doble=obj.nextDouble();
		System.out.println("yo soy la variable doble: "+doble);
		//caracter
		System.out.println("favor introdusca un caracter: ");
		char caracter=obj.next().charAt(0);
		System.out.println("este es el valor del caracter: "+caracter);
		
		System.out.println("hola este en un nuevo cambio")
		
	}

}
