package in.co.sunrays.corejava;

public class MissingAnElement {

	int findMisingNumber(int[] aArray, int[] bArray) {
		int sumA = 0, sumB = 0;
		for (int i = 0; i < aArray.length; i++) {
			sumA += aArray[i];
		}
		for (int i = 0; i < bArray.length; i++)

		{
			sumB += bArray[i];
		}
		return sumA - sumB;
	}

	public static void main(String[] args) {
		int aArray[] = { 2, 3, 4, 5, 6, 7, 8, 9, 1, 0 };
		int bArray[] = { 2, 3, 4, 5, 7, 8, 9, 1, 0 };

		MissingAnElement ele = new MissingAnElement();

		int missElement = ele.findMisingNumber(aArray, bArray);
		System.out.println("Missing Number is " + missElement);
	}
}
