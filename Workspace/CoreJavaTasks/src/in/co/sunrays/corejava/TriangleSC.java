package in.co.sunrays.corejava;

import java.util.Scanner;

public class TriangleSC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no.");

		int i = sc.nextInt();
		for (int j = 1; j <= i; j++) {

			for (int j2 = 1; j2 <= j; j2++) {
				System.out.print(" " + j + " ");
			}

			System.out.println();
		}

	}
}
