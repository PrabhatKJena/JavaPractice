package edu.pk.java.test;

public class ConditionalStmtTest {
	public static void main(String[] args) {
		/*boolean result = isPrime(3);
		System.out.println(result);
		int sum = sumOfDigits(124);
		System.out.println(sum);
		int reverse = revers(1234);
		System.out.println(reverse);
		boolean numrpalindrum = isPallindrom(12321);
		System.out.println(numrpalindrum);
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(154));
		printArmstrong(1, 15000);

		printPrime(1,100);*/

		factorial(5);
		
	}

	// Print all armstrong numbers from m to n
	private static void printArmstrong(int first, int last) {
		for (; first <= last; first++) {
			if (first >= 100 && first < 1000) {
				boolean result = isArmstrong(first); // calling stmt
				if (result) {
					System.out.println(first);// last
				}
			}
		}
	}

	private static void printPrime(int first, int last) {
		for (; first <= last; first++) {

				boolean result = isPrime(first); // calling stmt
				if (result) {
					System.out.println(first);// last
				}

		}
	}

	private static boolean isArmstrong(int first) { // called function
		int sumofcube = 0;
		for (int num = first; num > 0; num = num / 10) {
			int remainder = num % 10;
			sumofcube += (int) Math.pow(remainder, 3);
		}
		if (sumofcube == first) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int num) {
		int i;
		int count = 0;
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public static int sumOfDigits(int num) {
		int remainder;
		int sum = 0;
		for (; num > 0; num = num / 10) {
			remainder = num % 10;
			sum = sum + remainder;

		}
		return sum;
	}

	public static int revers(int num) {
		int remainder;
		int sum = 0;
		for (; num > 0; num = num / 10) {
			remainder = num % 10;
			sum = sum * 10 + remainder;
		}
		return sum;
	}

	public static boolean isPallindrom(int num) {
		int sum = revers(num);
		if (sum == num) {
			return true;
		}
		return false;
	}

	public static int factorial(int num){
		int fact=1;
		for(;num>=1;num--) {
			fact = fact * num ;
		}
		return fact;
	}
}
