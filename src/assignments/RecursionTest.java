package assignments;

public class RecursionTest {
	public static boolean isPrime(int number){
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
