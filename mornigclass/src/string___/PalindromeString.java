package string___;

public class PalindromeString {

	public static void main(String[] args) {
		String s="Radar".toLowerCase();
		String res="";
   for(int i=s.length()-1;i>=0;i--) {
	   res=res+s.charAt(i);
        }
   System.out.println(res);
         if(s.equals(res)) {
        	 System.out.println("PalindromeString");
         }
         else {
        	 System.out.println("not a Palindromestring");
         }
	}
}
