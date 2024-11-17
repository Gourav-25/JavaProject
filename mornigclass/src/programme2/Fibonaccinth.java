package programme2;
import java.util.Scanner;
public class Fibonaccinth {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a no");
      int n=s.nextInt(),a=0,b=1,c=0;
      while(n>1) {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  n--;
      }
      System.out.println(a);
	}
}
