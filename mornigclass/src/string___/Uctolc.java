package string___;

public class Uctolc {

	public static void main(String[] args) {
		String s="My name is Aman";
	    char c[]=s.toCharArray();
	    String res=" ";
    	for(char temp:c) {
    		if(Character.isUpperCase(temp)) {
    			res=res+Character.toLowerCase(temp);
    		res=res+" ";
    		}
    		else {
    			if(Character.isLowerCase(temp))
    				res=res+Character.toUpperCase(temp);
    		res=res+" ";
    		}
    	}
    	
    	System.out.println(res);
     }
}
