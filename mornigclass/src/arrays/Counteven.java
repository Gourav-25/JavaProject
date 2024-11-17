package arrays;

public class Counteven {
	public static void main(String[]args) {
		int a[]= {14,21,28,27,5,12,4},count=0;
		for(int temp:a)
		{
			if(temp%2==0)
				count++;
		}
		System.out.println(count);
		
	}

}
