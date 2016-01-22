package in.co.sunrays.corejava;

public class SwapNoWithTemp {
	public static void main(String[] args) {

		int a = 10;
		int b = 15;
		int c;

		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
