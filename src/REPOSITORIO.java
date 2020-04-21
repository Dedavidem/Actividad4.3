import java.util.ArrayList;

public class REPOSITORIO {

	public static void main(String[] args) {

		ArrayList<Integer> Anumeros = new ArrayList();
		
		Anumeros.add(3);
		Anumeros.add(3);
		Anumeros.add(3);
		Anumeros.add(3);
		Anumeros.add(3);
		Anumeros.add(3);
		
		contarUltnumero.contador3(Anumeros);
		System.out.println(hacerMedia.media(Anumeros));
		parImpar.metPI(Anumeros);
		
	}
}

class contarUltnumero{
	
	public static void contador3(ArrayList<Integer> Acontar) {
		

		int numero=0;
		int contador = 0;

		
		for (int i=0; i<Acontar.size(); i++) {
			
			numero=Acontar.get(i); 							// NOS DA EL NUMERO GUARDADO EN ESA POSICION DEL ARRAY
			String nString = Integer.toString(numero);		// PASAMOS A STRING EL NUMERO
			int tamaño=nString.length();					// VEMOS LA CANTIDAD DE TAMAÑO QUE TIENE
			
			char digito=nString.charAt(tamaño-1);
			
			if (digito == '3') {
				
				contador++;
			}
		}
		
		System.out.println("El numero de tres en el ultimo digito son: " +contador);
		
	}
}



class hacerMedia {
	
	public static String media (ArrayList<Integer> LlenarMedia) {
		
		double acumulador = 0;
		String solucion;
		String res = "El resultado es ";
		double resultado;
		
		for (int i=0; i<LlenarMedia.size();i++) {
			
			acumulador=acumulador+LlenarMedia.get(i);
		}
		
		resultado= acumulador/LlenarMedia.size();
		solucion=String.valueOf(resultado);
		
		return res + resultado;
		
	}
}

class parImpar {
	
	public static void metPI (ArrayList<Integer> LlenarMedia) {
	
		double numero=0;
		int pares = 0;
		int impares = 0;
		
		for (int i=0; i<LlenarMedia.size(); i++) {
			
			numero = LlenarMedia.get(i);
	
			if (numero%2==0) {
			    pares++;
			}
			else {
				impares++;
			}	
		}System.out.println("Numero de pares: " +pares+ " Numero de impares: " + impares);
	}
}