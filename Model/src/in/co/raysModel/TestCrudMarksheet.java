package in.co.raysModel;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class TestCrudMarksheet {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testdelete();
		// testupdate();
		// testget();
		// testgetmeritlist();
		search();
	}

	private static void search() throws ClassNotFoundException, SQLException {
		MarskheetModel n = new MarskheetModel();
		List L = n.search();
		Iterator i = L.iterator();
		while (i.hasNext()) {
			MarksheetBean m = (MarksheetBean) i.next();
			System.out.println("roll no.:" + m.getRollno());
			System.out.println("name:" + m.getName());
			System.out.println("chemistry:" + m.getChemistry());
			System.out.println("physics:" + m.getPhysics());
			System.out.println("maths:" + m.getMaths());
		}

	}

	private static void testgetmeritlist() throws ClassNotFoundException, SQLException {
		MarskheetModel n = new MarskheetModel();
		List L = n.getmeritlist();
		Iterator i = L.iterator();
		while (i.hasNext()) {
			MarksheetBean m = (MarksheetBean) i.next();
			System.out.println("roll no.:" + m.getRollno());
			System.out.println("name:" + m.getName());
			System.out.println("chemistry:" + m.getChemistry());
			System.out.println("physics:" + m.getPhysics());
			System.out.println("maths:" + m.getMaths());
			System.out.println("Total marks:" + (m.getChemistry() + m.getPhysics() + m.getMaths()));
			System.out.println("-------------------------------");
		}
	}

	private static void testget() throws ClassNotFoundException, SQLException {
		MarksheetBean m = new MarksheetBean();
		MarskheetModel n = new MarskheetModel();
		m.setRollno(103);
		n.get(m);
		System.out.println("roll no:" + m.getRollno());
		System.out.println("name:" + m.getName());
		System.out.println("Chemistry:" + m.getChemistry());
		System.out.println("Physics:" + m.getPhysics());
		System.out.println("Maths:" + m.getMaths());
	}

	private static void testupdate() throws ClassNotFoundException, SQLException {
		MarksheetBean m = new MarksheetBean();
		MarskheetModel n = new MarskheetModel();
		m.setName("lily");
		m.setRollno(123);
		n.update(m);
		System.out.println("update success");
	}

	private static void testdelete() throws ClassNotFoundException, SQLException {
		MarksheetBean m = new MarksheetBean();
		MarskheetModel n = new MarskheetModel();
		m.setRollno(123);
		n.delete(m);
		System.out.println("delete success");
	}

	private static void testadd() throws Exception, SQLException {
		MarksheetBean m = new MarksheetBean();
		MarskheetModel n = new MarskheetModel();
		m.setRollno(123);
		m.setName("sunidhi");
		m.setChemistry(80);
		m.setPhysics(89);
		m.setMaths(95);
		n.add(m);
		System.out.println("add success");
	}

}
