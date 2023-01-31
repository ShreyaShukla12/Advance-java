package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.co.rays.bean.UserBean;

public class UserModel {
	public static int nextpk() throws ClassNotFoundException, SQLException {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("select max(id) from user");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);
		}
		return pk + 1;
	}

	public void add(UserBean bean) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
		ps.setInt(1, nextpk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getGender());
		ps.setString(5, bean.getEmailid());
		ps.setString(6, bean.getPassword());
		int i = ps.executeUpdate();
	}

public UserBean authenticate(String emailid, String password) throws ClassNotFoundException, SQLException {
	UserBean ub=new UserBean();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	try {
		PreparedStatement ps = con.prepareStatement("select* from user where emailid=? password=?");
		ps.setString(1, emailid);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			ub.setId(rs.getInt(1));
			ub.setFname(rs.getString(2));
			ub.setLname(rs.getString(3));
			ub.setGender(rs.getString(4));
			ub.setEmailid(rs.getString(5));
			ub.setPassword(rs.getString(6));
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return null;
}

		
}

