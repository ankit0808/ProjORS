package in.co.sunrays.primeno;

public class PrimeNumber {
	public boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String a[]) {
		PrimeNumber mpc = new PrimeNumber();
		System.out.println("Is 7 prime number? " + mpc.isPrimeNumber(7));
		System.out.println("Is 9 prime number? " + mpc.isPrimeNumber(9));
		System.out.println("Is 15 prime number? " + mpc.isPrimeNumber(15));
	}
}
