package in.co.sunrays.corejava;

public class SecondLargestNo {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };
		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				secondlargest = largest;
				largest = a[i];

			} else if (secondlargest < a[i]) {
				secondlargest = a[i];
			}
		}
		System.out.println(secondlargest);

	}

}
