package string___;

public class ReverseString {

	public static void main(String[] args) {
          String s="Hello My name is Ram";
          String res=" ";
          for(int i=s.length()-1;i>=0;i--) {
        	  res=res+s.charAt(i);
          }
               System.out.println(res);
	}

}
