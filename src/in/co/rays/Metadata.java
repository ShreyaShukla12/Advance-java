package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Metadata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select id,name,salary,city from employes");
		java.sql.ResultSetMetaData m = r.getMetaData();
		System.out.println("catlog name:" + m.getCatalogName(1));
		System.out.println("table name:" + m.getTableName(1));
		int columnCount = m.getColumnCount();
		System.out.println("Total columns:" + columnCount);
		for (int i = 1; i <= columnCount; i++) {
			System.out.println("column:" + (i));
			System.out.println("Label:" + m.getColumnLabel(i));
			System.out.println("Name:" + m.getColumnName(i));
			System.out.println("Type:" + m.getColumnTypeName(i));
			System.out.println("Size:" + m.getColumnDisplaySize(i));
			System.out.println("Precision:" + m.getPrecision(i));
		}
	}

}
