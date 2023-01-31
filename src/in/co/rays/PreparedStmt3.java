package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmt3 {
	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement p=con.prepareStatement("update employes set salary=? where id=?");
		p.setInt(1,99999);
		p.setInt(2, 115);
	 int i=p.executeUpdate();
	 System.out.println(i+"record updated");
				
				
	}

}
