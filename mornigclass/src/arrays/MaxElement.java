package arrays;

public class MaxElement {

	public static void main(String[] args) {
		int a[]= {25,5,4,32,17,89};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
}
     }
 