package in.co.sunrays.oops;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setColor("Blue");
		r.setBorderwidth(0);
		r.setCircumference(10);
		r.setLength(5);
		r.setBreadth(5);

		System.out.println(r.getColor());
		System.out.println(r.getBorderwidth());
		System.out.println(r.getCircumference());
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.area());
	}
}
