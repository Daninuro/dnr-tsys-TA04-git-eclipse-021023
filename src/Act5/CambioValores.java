package Act5;

//PROGRAMA QUE CAMBIE VALORES INICIALES

		//  B TOMA VALOR DE C
		//  C TOMA VALOR DE A
		//  A TOMA VALOR DE D
		//  D TOMA VALOR DE B

public class CambioValores 
{

	public static void main(String[] args) 
	{

		int A, B, C, D;
		
		
		A=10;
		B=15;
		C=20;
		D=25;
		
		System.out.println("VALOR ORIGINAL DE LAS VARIABLES");
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);
		
		B=C;
		C=A;
		A=D;
		D=B;
		
		
		System.out.println("VALOR DE LAS VARIABLES UNA VEZ CAMBIADO");	
		System.out.println("A = "+A);
		System.out.println("B = "+B);
		System.out.println("C = "+C);
		System.out.println("D = "+D);


		
		
		
	}

}
