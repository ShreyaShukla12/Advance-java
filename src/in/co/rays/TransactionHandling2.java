package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionHandling2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		try {
			con.setAutoCommit(false);
			String s1 = "delete from employes where id= 121";
			String s2 = " delete from employes where id=123";
			Statement st = con.createStatement();
			int i = st.executeUpdate(s1);
			i = st.executeUpdate(s2);
			System.out.println(i + "data inserted");
			con.commit();
			} catch (Exception e) {
				con.rollback();
				System.out.println("data not inserted");
				System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}

}
