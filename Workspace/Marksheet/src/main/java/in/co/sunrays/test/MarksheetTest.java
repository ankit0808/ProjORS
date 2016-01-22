package in.co.sunrays.test;

import in.co.sunrays.bean.MarkshetVO;
import in.co.sunrays.service.MarksheetService;

public class MarksheetTest {
	public static void main(String[] args) throws Exception {
		add();
	}

	public static void add() throws Exception {
		MarkshetVO mark = new MarkshetVO();
		mark.setRollno(105);
		mark.setName("wari");
		mark.setChemistry(90);
		mark.setPhysics(90);
		mark.setMaths(90);

		MarkshetVO mark1 = new MarkshetVO();
		mark1.setRollno(104);
		mark1.setName("ramwsh"); 
		mark1.setChemistry(90);
		mark1.setPhysics(90);
		mark1.setMaths(90);

		MarksheetService service = new MarksheetService();

		service.add(mark);
		service.add(mark1);

	}

}
