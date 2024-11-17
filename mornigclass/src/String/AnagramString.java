package String;

public class AnagramString {

	public static void main(String[] args) {
		String s1="Race".toLowerCase();
		String s2="Care".toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("not an Anagram String");
		}
		else {
			int count=0;
			for(int i=0;i<s1.length();i++) {
				
		   for(int j=0;j<s2.length();j++) {
			  if(s1.charAt(i)==s2.charAt(j)) {
				 count++;
			  }
		   }
			}
         System.out.println(count==s2.length()?"AnagramString":"Not an Anagram String");			
		}
	}
}
