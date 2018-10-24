/*Author: Diego Velazquez Alvarez
**Date: 2018/10/24
***Description: Este programa detecta si es un numero natural perfecto*/

import java.util.*; //Import the utilities using the wildcard.

public class naturalPerfecto {

//Main method:
	public static void main( String[] args ){

		Scanner kb = new Scanner(System.in);
		int userNumber;
		int suma = 0;

		System.out.println("Por favor entra el número que quieras saber si es natural perfecto:");
		userNumber = kb.nextInt();

		//Número cuyos divisores sumados, dan el número:

		for (int i = 1; i < userNumber; i++) {  // i son los divisores. Se divide desde 1 hasta n-1

		            if (userNumber % i == 0) {
		                suma = suma + i;     // si es divisor se suma
		            }
		        }
		        if (suma == userNumber) {  // si el numero es igual a la suma de sus divisores es perfecto

		            System.out.println(userNumber + " es Natural Perfecto");

		        } else {
		            System.out.println(userNumber + " no es Natural Perfecto");

        }

	}
}