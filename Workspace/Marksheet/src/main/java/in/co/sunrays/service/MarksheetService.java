package in.co.sunrays.service;

import in.co.sunrays.bean.MarkshetVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

public class MarksheetService {

	public void add(MarkshetVO vo) throws Exception{
		
	ResourceBundle rb = ResourceBundle.getBundle("in.co.sunrays.bundle.system");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"),rb.getString("user"),rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("insert into marks values (?,?,?,?,?)");
		ps.setInt(1, vo.getRollno());
		ps.setString(2, vo.getName());
		ps.setInt(3,  vo.getChemistry());
		ps.setInt(4, vo.getPhysics());
		ps.setInt(5, vo.getMaths());
		
		ps.executeUpdate();
		System.out.println("upadeted");
	}
}
