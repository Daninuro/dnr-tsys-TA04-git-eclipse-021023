package Act3;

public class OperacionesDecimales 
{

	public static void main(String[] args) 
	{

		int X=10,Y=5;
		double N=3.14,M=8.5;
		double Suma, Resta, Multiplica, Division, Resto, DobleX, DobleY, DobleN, DobleM, SumaTodos, MultiplicaTodos;
		double Suma2, Resta2, Multiplica2, Division2, Resto2;
		
		
		Suma=X+Y;
		Resta=X-Y;
		Multiplica=X*Y;
		Division=X/Y;
		Resto=X%Y;		
		Suma2=N+M;
		Resta2=N-M;
		Multiplica2=N*M;
		Division2=N/M;
		Resto2=N%M;
		DobleX=X*2;
		DobleY=Y*2;
		DobleN=N*2;
		DobleM=M*2;
		SumaTodos=X+Y+N+M;
		MultiplicaTodos=X*Y*N*M;
		
		
		System.out.println("Los 4 números són: "+X+", "+Y+", "+N+" y "+M);
		System.out.println("La Suma de "+X+" y "+Y+ " és: "+Suma);
		System.out.println("La Diferencia de "+X+" y "+Y+ " és: "+Resta);
		System.out.println("El Producto de "+X+" y "+Y+ " és: "+Multiplica);
		System.out.println("El Cociente de "+X+" y "+Y+ " és: "+Division);
		System.out.println("El Resto de "+X+" y "+Y+ " és: "+Resto);
		
		System.out.println("La Suma de "+N+" y "+M+ " és: "+Suma2);
		System.out.println("La Diferencia de "+N+" y "+M+ " és: "+Resta2);
		System.out.println("El Producto de "+N+" y "+M+ " és: "+Multiplica2);
		System.out.println("El Cociente de "+N+" y "+M+ " és: "+Division2);
		System.out.println("El Resto de "+N+" y "+M+ " és: "+Resto2);
		
		System.out.println("El Doble de "+X+" és: "+DobleX);
		System.out.println("El Doble de "+Y+" és: "+DobleY);
		System.out.println("El Doble de "+N+" és: "+DobleN);
		System.out.println("El Doble de "+M+" és: "+DobleM);
		
		System.out.println("La Suma de los 4 números és: "+SumaTodos);

		
		System.out.println("El Producto de los 4 números és: "+MultiplicaTodos);

		

	}

}
