package in.co.sunrays.sunrays;

public class StringObject {

	public static void main(String[] args) {

		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		System.out.println("s1==s2 is :" + (s1 == s2));
		System.out.println("s1.equals(s2)) :" + s1.equals(s2));

		String s3 = new String("SUNRAYS");
		String s4 = new String("SUNRAYS");

		System.out.println("s1==s3 is :" + (s1 == s3));
		System.out.println("s3==s4 is :" + (s3 == s4));
		System.out.println("s3.equals(s4) is :" + s3.equals(s4));

		String s5 = "Hel" + "lo";
		String s6 = "he" + "llo";

		System.out.println("s5==s6 is :" + (s5 == s6));
		System.out.println("s5.equals(s6) is :" + s5.equals(s6));

		String s = "lo";
		String s7 = "Hel" + s;
		String s8 = "He" + "llo";
		System.out.println("str7 is computed at runtime" + s7); //
		System.out.println("s7==s8 is :" + (s7 == s8));
	}
}
