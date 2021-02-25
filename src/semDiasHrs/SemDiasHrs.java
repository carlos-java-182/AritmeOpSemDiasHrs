package semDiasHrs;

import java.util.Scanner;

public class SemDiasHrs {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int horas, sem, días, residuosem, residuodías;
		
		System.out.println("Digita las horas");
		horas=entrada.nextInt();
		
		sem=horas/168;
		residuosem=horas%168;
		
		días=residuosem/24;
		residuodías=residuosem%24;
		
		
		
		System.out.println("Son: \n" + sem +  " semanas");
		System.out.println(días + " días y ");
		System.out.println(residuodías + " horas");
		
		
		
		
		

	}

}
