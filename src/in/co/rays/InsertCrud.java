package in.co.rays;

import java.sql.*;

public class InsertCrud {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	Statement s=con.createStatement();
	int i=s.executeUpdate("update employes set salary=500000 where id=119");
	System.out.println(i+"record updated");
	
	
	
	}

}
