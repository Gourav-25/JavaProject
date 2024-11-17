package programme2;
import java.util.Scanner;
public class Aadhar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		long Aadhar=s.nextLong(),count=0;
		for(;Aadhar>0;Aadhar/=10)
		{
			count++;
		}
				System.out.println(count==12?"Valid Aadhar no":"Inavalid Aadhar no");		
	}
}
