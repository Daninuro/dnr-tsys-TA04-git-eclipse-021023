package Act4;

//Incrementa N en 77
//Decrementa en 3
//Duplica el valor

public class IncrementarYDecrementar 
{

	public static void main(String[] args) 
	{
		
		int N=10;
		int Incrementar, Decrementar, Duplicar;
		
		Incrementar=N+77;
		Decrementar=Incrementar-3;
		Duplicar=Decrementar*2;
		
		System.out.println("El valor inicial de N = "+N);
		System.out.println("N + 77 = "+Incrementar);
		System.out.println("N - 3 = "+Decrementar);
		System.out.println("N * 2 = "+Duplicar);
		

	}

}
