package sin;

import java.util.Scanner;

public class dolor {
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Introduce el primer número");
			int num1 = sc.nextInt();
			
			System.out.println("Introduce el segundo número");
			int num2 = sc.nextInt();
			
			System.out.println("La suma de "+ num1 + " y " + num2 + " es igual " + (num1+num2));
			
		sc.close();}

}
