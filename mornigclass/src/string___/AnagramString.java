package string___;

public class AnagramString {

	public static void main(String[] args) {
		String s1="Race".toLowerCase();
		String s2="Races".toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("Not an Anagram String");
		}
		else {
		int count=0;
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if(s1.charAt(i)==s2.charAt(j))
						count++;				
				}
			}
			System.out.println(count==s1.length()?"Anagram String":"Not Anagram String");
		}
	}
}

