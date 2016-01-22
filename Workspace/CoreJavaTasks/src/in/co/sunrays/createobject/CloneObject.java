package in.co.sunrays.createobject;

public class CloneObject implements Cloneable {
	private int rollno;
	private String name;

	CloneObject(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String args[]) throws Exception {

		CloneObject s1 = new CloneObject(101, "amit");

		CloneObject s3 = new CloneObject(103, "ankit");

		CloneObject s2 = (CloneObject) s1.clone();

		System.out.println(s1.rollno + " " + s1.name);
		System.out.println(s2.rollno + " " + s2.name);
		System.out.println(s3.rollno + " " + s3.name);

	}

	protected Object clone() throws CloneNotSupportedException {
		CloneObject c = (CloneObject) super.clone();
		return c;
	}
}
