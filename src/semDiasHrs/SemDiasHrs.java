package semDiasHrs;

import java.util.Scanner;

public class SemDiasHrs {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int horas, sem, d�as, residuosem, residuod�as;
		
		System.out.println("Digita las horas");
		horas=entrada.nextInt();
		
		sem=horas/168;
		residuosem=horas%168;
		
		d�as=residuosem/24;
		residuod�as=residuosem%24;
		
		
		
		System.out.println("Son: \n" + sem +  " semanas");
		System.out.println(d�as + " d�as y ");
		System.out.println(residuod�as + " horas");
		
		
		
		
		

	}

}
