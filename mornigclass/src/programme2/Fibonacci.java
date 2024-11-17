package programme2;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
         System.out.println("enter a no");
          int n=s.nextInt();
          int a=0,b=1,c=0;
          while(n>0) {
        	  System.out.println(a);
        	  c=a+b;
        	  a=b;
        	  b=c;
        	  n--;
          }
          
	}

}
