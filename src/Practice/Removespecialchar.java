package Practice;

public class Removespecialchar {

	public static void main(String[] args) {
		
		String s="%^%$^%$^$SUPREETH121736812";
		
		//By Regular Expression we can remove all unwanted char
		
		s=s.replaceAll("[^a-zA-Z1-9]", "");
		System.out.println(s);
	}

}
