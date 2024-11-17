package arrays;
import java.util.Scanner;
public class CountRepeated {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a[]= {2,45,67,8,2,54,67,23,56,78,9,23,78,54,78},count=0;
		for(int temp:a) {
			if(temp==n)
				count++;
		}
		System.out.println("The given no " +n +" is repeated " +count  +" times");
	}
}
