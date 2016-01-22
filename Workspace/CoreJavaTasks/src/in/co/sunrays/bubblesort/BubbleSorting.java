package in.co.sunrays.bubblesort;

public class BubbleSorting {
	public static void main(String[] args) {

		int temp;
		int a[] = { 2, 5, 7, 11, 21, 12, 3, 4, 6, 9 };

		System.out.println("Before");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "\t");

		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {

				if (a[j - 1] > a[j]) {

					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\n");
		System.out.println("After");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}
}
