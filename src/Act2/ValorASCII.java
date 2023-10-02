package Act2;


public class ValorASCII 
{

	public static void main(String[] args) 
	{

		int N=5;
		double A=4.56;
		char C='a';
		double Suma, Resta;
		int ValorNumerico;
		
		Suma=N+A;
		Resta=A-N;
		
		//Cambiamos de char a int (Valor ASCII)
		ValorNumerico=(int)C;
					
		
		System.out.println("Variable N = "+N);
		System.out.println("Variable A = "+A);
		System.out.println("Variable C = "+C);
		System.out.println(N+" + "+A+" = "+Suma);		
		System.out.println(A+" - "+N+" = "+Resta);	
		System.out.println("Valor numérico del carácter: "+C+" = "+ValorNumerico);


	}

}
