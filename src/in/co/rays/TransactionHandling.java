package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionHandling {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		try {
			con.setAutoCommit(false);
			String s1 = "insert into employes values(121,'pooja',56000,'home','Kanpur','UP')";
			String s2 = " insert into employes values(123,'Darshan',60000,'office','Dispur','Assam')";
			String s3 = "update employes set city='Guwahati' where id=125";
			Statement st = con.createStatement();
			int i = st.executeUpdate(s1);
			i = st.executeUpdate(s2);
			i = st.executeUpdate(s3);
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
