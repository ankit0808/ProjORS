package in.co.sunrays.oops;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle();

		Shape s = new Circle();

		s.setColor(null);
		s.setBorderwidth(89);

		c.setColor("VOILET");
		c.setBorderwidth(0);
		c.setCircumference(90);
		c.setRadius(5);

		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());

		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println(c.getCircumference());
		System.out.println(c.getRadius());
		System.out.println(c.area());
	}

}
