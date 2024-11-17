package programme2;
import java.util.Scanner;
public class Palindromeno {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a no");
        int n=s.nextInt();
        int originalno=n;
        int rev=0;
    for(;n!=0;n/=10) {
    	int last=n%10;
    	rev=rev*10+last;
    }    
    System.out.println(rev);
   System.out.println(originalno==rev?"palindrome no":"Not palindromeno");
	    }

}
