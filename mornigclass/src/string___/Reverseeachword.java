package string___;

public class Reverseeachword {

	public static void main(String[] args) {
		String s="How are you";
		String word[]=s.split(" ");
		String res="";
		for(String k:word) {
			
			for(int i=k.length()-1;i>=0;i--) {
				res=res+k.charAt(i);			
			}
			res=res+" ";
		}
		System.out.println(res);
	}
	    }
               