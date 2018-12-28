package Practice;

public class ReverseSting {

	public static void main(String[] args) {
		
		//First method 
	
		String s= "SUPREETH";
		int a=s.length();
	   String reverse="";
			for(int i=s.length()-1;i>=0;i--){
		  reverse=reverse+s.charAt(i);
		}
	   System.out.println(reverse);
		
		//second method
		
		
	//	String s="1234";
      //  StringBuffer S=new StringBuffer(s);
        //System.out.println(S.reverse());
	
	}

}
