/*Author: Diego Velazquez Alvarez
**Date: 2018/10/24
***Description: Este programa dice si un año que entre el usuario es bisiesto*/

import java.util.*; //Import the utilities using the wildcard.

public class bisiesto {

//Main method:
	public static void main( String[] args ){

		Scanner kb = new Scanner(System.in);
		int userYear;

		System.out.println("Porfavor entre el año para ver si es bisiesto:");
		userYear = kb.nextInt();

		if(userYear % 400 == 0){

			System.out.println(userYear + " es un año bisiesto.");



			} else{

					if(userYear % 4 == 0 && userYear % 100 != 0){

									System.out.println(userYear + " es un año bisiesto.");

									} else{

										System.out.println(userYear + " no es un año bisiesto.");

					}

					}

	}
}