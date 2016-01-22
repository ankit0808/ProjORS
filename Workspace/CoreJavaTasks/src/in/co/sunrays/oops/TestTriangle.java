package in.co.sunrays.oops;

public class TestTriangle {

	public static void main(String[] arg) {

		Triangle t = new Triangle();

		t.setColor("LAAl");
		t.setBorderwidth(34);
		t.setBase(2);
		t.setHeight(3);

		System.out.println(t.getColor());
		System.out.println(t.getBorderwidth());
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(t.area());

	}

}
