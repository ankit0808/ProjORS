package in.co.sunrays.oops;

public abstract class Shape {

	private String color;
	private int borderwidth;
	private int circumference;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public int getCircumference() {
		return circumference;
	}

	public void setCircumference(int circumference) {
		this.circumference = circumference;
	}

	public abstract double area();

}
