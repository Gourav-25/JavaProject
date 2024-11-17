package string___;

public class Reverseword1 {

	public static void main(String[] args) {
	String s="How are you";
	String res=" ";
	for(int i=s.length()-1;i>=0;i--) {
		 res=res+s.charAt(i);
	   }
	System.out.println(res);
	}
}
