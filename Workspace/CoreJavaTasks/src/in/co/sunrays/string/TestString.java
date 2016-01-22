package in.co.sunrays.string;

public class TestString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Ankit");
		sb.append(" Parmar");
		String s = sb.toString();

		System.out.println(sb + " " + s);

		StringBuilder s1 = new StringBuilder("Vijay");
		s1.append(" Dinanath");
		String s2 = s1.toString();
		System.out.println(s1 + " " + s2);

	}

}
