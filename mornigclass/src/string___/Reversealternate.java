package string___;

public class Reversealternate {

	public static void main(String[] args) {
		String s="East or West Bharat is Best";
		String []word=s.split(" ");
		String res=" ";
		for(int i=0;i<word.length;i++) {
			if(i%2==0) {
				for(int j=word[i].length()-1;j>=0;j--) {
					res=res+word[i].charAt(j);
				}
			}
			res=res+" ";			
		}
          System.out.println(res);
	}
}
