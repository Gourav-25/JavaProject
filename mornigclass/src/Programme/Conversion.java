package Programme;
import java.util.Scanner;
public class Conversion {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		float celsius=s.nextFloat();
		float farenheit=((celsius)*9)/5+32;
		System.out.println(farenheit);
	}
}
