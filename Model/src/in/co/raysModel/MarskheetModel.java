package in.co.raysModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MarskheetModel {
	public static void add(MarksheetBean m) throws Exception {
//		Class.forName("com.mysql.cj.jbdc.Driver").newInstance();
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement p = con.prepareStatement("insert into marksheet values(?,?,?,?,?)");
		p.setInt(1, m.getRollno());
		p.setString(2, m.getName());
		p.setInt(3, m.getChemistry());
		p.setInt(4, m.getPhysics());
		p.setInt(5, m.getMaths());
		int i = p.executeUpdate();
		System.out.println(i + "records inserted");
	}

	public static void delete(MarksheetBean m) throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement a = con.prepareStatement("delete from marksheet where rollno=?");
		a.setInt(1, m.getRollno());
		int j = a.executeUpdate();
		System.out.println(j + "record deleted");
	}

	public static void update(MarksheetBean m) throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement b = con.prepareStatement("update marksheet set name=? where rollno=?");
		b.setString(1, m.getName());
		b.setInt(2, m.getRollno());
		int k = b.executeUpdate();
		System.out.println(k + "record update");
	}

	public static void get(MarksheetBean m) throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement b = con.prepareStatement("select * from marksheet where rollno=?");
		b.setInt(1, m.getRollno());
		ResultSet rs = b.executeQuery();
		while (rs.next()) {
			m.setRollno(rs.getInt(1));
			m.setName(rs.getString(2));
			m.setChemistry(rs.getInt(3));
			m.setPhysics(rs.getInt(4));
			m.setMaths(rs.getInt(5));
		}
	}

	public static List getmeritlist() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement b = con.prepareStatement(
				"select *from marksheet where(chemistry>33 and physics>33 and maths>33) order by(chemistry+physics+maths) desc limit 0,10");
		ResultSet r = b.executeQuery();
		List l = new ArrayList<MarksheetBean>();
		while (r.next()) {
			MarksheetBean m = new MarksheetBean();
			m.setRollno(r.getInt(1));
			m.setName(r.getString(2));
			m.setChemistry(r.getInt(3));
			m.setPhysics(r.getInt(4));
			m.setMaths(r.getInt(5));
			l.add(m);
		}
		return l;
	}

	public static List search() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysModel.System");
		Class.forName(rb.getString("Driver"));
		Connection con = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement p = con.prepareStatement("select* from marksheet where rollno=103");
		ResultSet r = p.executeQuery();
		List l = new ArrayList<MarksheetBean>();
		while (r.next()) {
			MarksheetBean m = new MarksheetBean();
			m.setRollno(r.getInt(1));
			m.setName(r.getString(2));
			m.setChemistry(r.getInt(3));
			m.setPhysics(r.getInt(4));
			m.setMaths(r.getInt(5));
			l.add(m);
		}
		return l;
	}

}
