package string___;

public class Reversealternate1 {

	public static void main(String[] args) {
	String s="East or West Java is Best";
	String word[]=s.split(" ");
	String res=" ";
    for(int i=0;i<word.length;i++) {
    	if(i%2==0) {
    		String t=word[i];
    		for(int j=t.length()-1;j>=0;j--) {
    			res=res+t.charAt(j);
    		}
    		res=res+" ";
    	}
      }
    System.out.println(res);
	}
}
   