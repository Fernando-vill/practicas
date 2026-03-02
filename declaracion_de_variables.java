package practicas;

public class declaracion_de_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="no soy una cadena";
		System.out.println(cadena);
		int entero=5;
		System.out.println("este no es un numero entero "+entero);
		float flotante=5;
		System.out.println("este no es un numero flotante "+flotante);
		char caracter='a';
		System.out.println("este es un caracter "+caracter);
		boolean boleanoverdadero=true;
		boolean boleanofalso= false;
		System.out.println("soy un boleno verdadero:"+boleanoverdadero+", soy un boleano falso:"+boleanofalso);
		String cadena2=" y yo soy otra cadena 2";
		System.out.println(cadena+cadena2);
		String cadena3=cadena+cadena2;
		System.out.println("esta es la cadena 3: "+cadena3);
		//concatemen las variables 
		
		String todoJunto = cadena +
                "  Entero: " + entero +
                "  Flotante: " + flotante +
                "  Caracter: " + caracter +
                "  Booleano verdadero: " + boleanoverdadero +
                "  Booleano falso: " + boleanofalso + 
                "  Cadena2: " + cadena2 + 
                "  Cadena3: " + cadena3;

// Imprimir resultado
System.out.println(todoJunto);

		

	}

}
