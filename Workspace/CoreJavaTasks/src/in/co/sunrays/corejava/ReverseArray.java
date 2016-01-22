package in.co.sunrays.corejava;

public class ReverseArray {
	public static void main(String[] args) {
		int temp;
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("before");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		System.out.println();
		System.out.println("after");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
		System.out.println();
		System.out.print(a[0]);
	}

}
