package string___;

public class UctoLc_LctoUc {

	public static void main(String[] args) {
		String s="My name is Aman";
		char c[]=s.toCharArray();
		String res=" ";
		for(char temp:c) {
			if(Character.isUpperCase(temp))
				res=res+Character.toLowerCase(temp);
			if(Character.isLowerCase(temp))
				res=res+Character.toUpperCase(temp);
		}
            System.out.println(res);
	}
}
