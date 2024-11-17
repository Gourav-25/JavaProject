package String;

public class UctoLc {
       
	public static void main(String[] args) {
		String s="AmanGouravGupta";
		String res=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=65&&c<=90)
			res=res+Character.toLowerCase(c);
			else if(c>=97&&c<=122) {
				res=res+Character.toUpperCase(c);
			}
		}
		System.out.println(res);
	}
}