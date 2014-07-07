package assignments;

import java.util.Scanner;

public class RecursionTest {
	public static boolean isPrime(){
		System.out.println("Enter a # to check if it is prime");
		Scanner scstdin = new Scanner(System.in);
		String num = scstdin.nextLine();
		while (num.equals("")){
			System.out.println("Unable to detect a # Please enter a #");
			num = scstdin.nextLine();
		}
		int number = Integer.parseInt(num);
		
		if (number == 1){
			return false;
		}
		return isPrime(number, 2);
	}

	private static boolean isPrime(int number, int n){
		if (number == n){
			return true;
		}
		if (number % n == 0){
			return false;
		}
		return isPrime(number, n + 1);
	}

	public static double power(double base, int exponent) {
		if (base == 0 && exponent ==0){
			return -1;
		}
		if (base == 0){
			return 0.0;
		}
		if (base == 1){
			return 1.0;
		}
		if (exponent == 0){
			return 1.0;
		}
		if (exponent == 1){
			return base;
		}
		if (exponent == -1){
			return 1.0 / base;
		}
		if (exponent < -1){
			return 1.0 / base * power(base, ++exponent);
		}
		return base* power(base, --exponent);
	}
}
