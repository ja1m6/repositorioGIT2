/**
 * Clase Array Personas
 * @author Alumno_03
 *
 */
public class APersonas {
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[]args) {
		String a="",u="",o="",i="",e="";
		int b=0,c=0,d=0;
		String e1="";
		String Array[] = {"Pepe","Antonia","Maria","Juan","Pablo","Ana","Luis"};
		calculara(a);
		calculare(e1);
		calculara(i);
		calculara(o);
		calculara(u);
		System.out.println(a);
		System.out.println(e);
		System.out.println(o);
		System.out.println(u);
		System.out.println(i);
	}
	/**
	 * Intento de metodos para calculo de letra A
	 * @param Array
	 */
	public static  void calculara(String Array) {
		int a=0;
		if(Array.equalsIgnoreCase("a")) {
			a++;
		}
		System.out.println(String.valueOf("a").charAt(a));
		
		
	}
	/**
	 * Intento de metodos para calculo de letra E
	 * @param Array
	 */
	public static  void calculare(String Array) {
		int a=0;
		if(Array.equalsIgnoreCase("e")) {
			a++;
		}
		System.out.println(String.valueOf("e").charAt(a));
		
		
	}
	/**
	 * Intento de metodos para calculo de letra I
	 * @param Array
	 */
	public static  void calculari(String Array) {
		int a=0;
		if(Array.equalsIgnoreCase("i")) {
			a++;
		}
		System.out.println(String.valueOf("i").charAt(a));
		
		
	}
	/**
	 * Intento de metodos para calculo de letra O
	 * @param Array
	 */
	public static  void calcularo(String Array) {
		int a=0;
		if(Array.equalsIgnoreCase("o")) {
			a++;
		}
		System.out.println(String.valueOf("o").charAt(a));
		
		
	}
	/**
	 * Intento de metodos para calculo de letra U
	 * @param Array
	 */
	public static  void calcularu(String Array) {
		int a=0;
		if(Array.equalsIgnoreCase("u")) {
			a++;
		}
		System.out.println(String.valueOf("u").charAt(a));
		
		
	}
}
