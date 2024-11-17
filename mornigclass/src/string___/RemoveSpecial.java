package string___;

public class RemoveSpecial {

	public static void main(String[] args) {
		String s="@Man Gourav%$$78";
		String res=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=48&&c<=57||c>=97&&c<=122||c>=65&&c<=90)
				res=res+c;
		}
		System.out.println(res);
	}

}
