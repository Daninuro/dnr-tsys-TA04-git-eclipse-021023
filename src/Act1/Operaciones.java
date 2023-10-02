package Act1;

//Declara dos variables númericos (con el valor que desees), muestra por consola la suma, resta, multiplicación, división, y módulo (resto de la división).

public class Operaciones 
{
	
	public static void main(String[] args) 
	{

		int Num1=15;
		int Num2=3;
		float Suma, Resta, Multiplicacion, Division, Resto;
		
				
		
		Suma=Num1+Num2;
		Resta=Num1-Num2;
		Multiplicacion=Num1*Num2;
		Division=Num1/Num2;
		Resto=Num1%Num2;
		
		
		System.out.println("Los números són: "+Num1 +" y "+Num2);
		System.out.println("La suma de los números és: "+Suma);
		System.out.println("La resta de los números és: "+Resta);
		System.out.println("La multiplicación de los números és: "+Multiplicacion);
		System.out.println("La división de los números és: "+Division);
		System.out.println("El módulo de los números és: "+Resto);
		
	
	
		
	}

}
