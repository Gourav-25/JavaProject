package arrays;

public class Sumeven {
	public static void main(String[] args) {
		int a[]= {12,15,16,18,17,5,10},sum=0;
		for(int temp:a) {
			if(temp%2==0) 
				sum+=temp;
			}
		System.out.println(sum);
		}
		
	}

