package arrays;

public class Sumodd {
	public static void main(String[] args) {
		int a[]= {14,7,5,12,17,11},sum=0;
		for(int temp:a) {
			if(temp%2==1)
				sum+=temp;
		}
		System.out.println(sum);
	}
}
