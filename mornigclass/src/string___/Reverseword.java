package string___;

public class Reverseword {

	public static void main(String[] args) {
		String s="How are you";
		String res=" ";
		String word[]=s.split(" ");
                   for(int i=word.length-1;i>=0;i--) {
                	   res=res+" "+word[i];
                	   
             }
                   System.out.println(res);
	}
}
