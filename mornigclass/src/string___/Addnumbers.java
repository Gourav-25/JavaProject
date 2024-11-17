package string___;

public class Addnumbers {

	public static void main(String[] args) {
	      String s="Ram1414";
	      String y="";
	      int sum=0;
	      for(int i=0;i<s.length();i++) {
	    	  if(s.charAt(i)>=48&&s.charAt(i)<=57)
	    		  y=y+s.charAt(i);
	    	  
	      }
	      int a=Integer.parseInt(y);
	      for(;a!=0;a/=10) {
	    	  int last=a%10;
	    	  sum+=last;
	      }
	      System.out.println(sum);
	}
}
