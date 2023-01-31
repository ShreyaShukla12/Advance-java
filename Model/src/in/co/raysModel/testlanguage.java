package in.co.raysModel;

import java.util.Locale;
import java.util.ResourceBundle;

public class testlanguage {
	
	public static void main(String[] args) {
		
		Locale l = new Locale("hi");
		ResourceBundle rb=ResourceBundle.getBundle("in.co.bundle.app_hi",l);
		System.out.println(rb.getString("greeting"));
		System.out.println(rb.getString("greeting1"));
		System.out.println(rb.getString("greeting2"));
		System.out.println(rb.getString("greeting3"));
		System.out.println(rb.getString("greeting4"));
		System.out.println(rb.getString("greeting5"));
		
	}

}
