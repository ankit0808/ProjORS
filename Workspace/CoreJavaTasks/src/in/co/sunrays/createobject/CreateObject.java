package in.co.sunrays.createobject;

public class CreateObject {

	public void display() {
		System.out.println("Hello World");
		System.out.println("h");
	}

	public static void main(String[] args) throws Exception {

		Class c1 = Class.forName("in.co.sunrays.task1.CreateObject");
		Object object = c1.newInstance();

		CreateObject cObject = (CreateObject) object;
		cObject.display();
	//	cObject.display();

	}

}
