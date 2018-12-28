package Practice;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="ABCDEFGH";
		String Y="absc";
		String J="ABSCSG";
		String Reverse ="";
        for (int i=S.length()-1;i>=0;i--){
        	Reverse = Reverse+S.charAt(i);
        }
	System.out.println(Reverse);

}}
