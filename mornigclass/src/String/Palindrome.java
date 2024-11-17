package String;

public class Palindrome {
	public static void main(String[] args) {
		String s1="EYE";
		String res="";
		for(int i=s1.length()-1;i>=0;i--) {
			char c=s1.charAt(i);
			res+=c;
		}
		System.out.println(res.equals(s1)?"Palindrome String":"Not Palindrome");
	}

}
