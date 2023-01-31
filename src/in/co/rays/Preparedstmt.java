package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preparedstmt {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement p=con.prepareStatement("insert into employes values(?,?,?,?,?,?)");
		p.setInt(1, 120);
		p.setString(2, "Rohan");
		p.setInt(3, 90000);
		p.setString(4,"ghar");
		p.setString(5, "Lucknow");
		p.setString(6, "up");
		
		int i=p.executeUpdate();
		System.out.println(i+"records inserted");
		
	}
}
