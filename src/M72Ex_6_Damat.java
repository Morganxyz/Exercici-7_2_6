import java.util.Scanner;

public class M72Ex_6_Damat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un nombre fins que trobes un primer: ");
		num1 = entrada.nextInt();
		
		
		while(primo(num1) == false) {
			System.out.println("Continua provant!: ");
			num1 = entrada.nextInt();
			}
		
		if(primo(num1) == true) {
				System.out.println("Exacte, el número " + num1 + " es primer!");
		
		}
		
	}

	public static boolean primo (int num1) {
		
		int i = 0;
		int sumaRest = 0;
		boolean pri = false;
		
		for(i = 1; i <= num1; i++) {
			
			if(num1 % i == 0) {
				sumaRest++;
			}
		}
		if(sumaRest <= 2) {
			pri = true;
			
		}else {
			pri = false;
		}
		
			return pri;

	}
}
