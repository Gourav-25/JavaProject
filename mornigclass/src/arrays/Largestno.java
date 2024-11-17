package arrays;

public class Largestno {

	public static void main(String[] args) {
	int a[]= {12,15,16,18,191,25,48,52};
	int max=a[0];
    for(int k:a) {
    	  if(k>max)
    		  max=k;
      }
    System.out.println(max);
	}
}
