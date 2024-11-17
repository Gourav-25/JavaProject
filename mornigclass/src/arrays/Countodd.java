package arrays;

public class Countodd {
	public static void main(String[] args) {
		int a[]= {21,19,4,16,13,18,17},count=0;
		for (int z:a) {
			if(z%2==1)
				count++;
		}
		System.out.println(count);
	}
}
