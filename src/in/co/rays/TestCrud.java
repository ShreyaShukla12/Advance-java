package in.co.rays;

import java.sql.*;

public class TestCrud {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select* from employes");
		while (rs.next()) {
			System.out.print("\t"+rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
		}

	}

}
