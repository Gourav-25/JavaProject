package string___;

public class RemoveNumber {

	public static void main(String[] args) {
		String s="Ab2hishek12";
		String res=" ";
       for(int i=0;i<s.length();i++) {
    	   if(!(s.charAt(i)>=48&&s.charAt(i)<=57))
    		   res=res+ s.charAt(i);
       }
       System.out.println(res);
	}
}
