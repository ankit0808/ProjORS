package in.co.sunrays.createobject;

public class FactoryCls {

	private int id;
	private String name;

	FactoryCls(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static FactoryCls getInstance(){
		return new FactoryCls(11, "name");
	}

	public static void main(String[] args) {
		FactoryCls fc = FactoryCls.getInstance();
		System.out.println(fc.id);
		System.out.println(fc.name);
	}
}
