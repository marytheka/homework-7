package utils;

public class Math {
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}

	public static int  factorialLoop(int n) {
		int result = 1;

		while (n > 0) {
			result  = result * n;
			--n;
		}

		return result;
	}
}
