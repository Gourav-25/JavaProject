package arrays;

public class SecondMax1 {

	public static void main(String[] args) {
		int a[]= {15,17,19,25,20,21};
		int max1=0,max2=0;
		if(a[0]>a[1]) {
			max1=a[0];
		    max2=a[1];
		}
		else {
			   max1=a[1];
			    max2=a[0];				
		} 
		for(int i=2;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
			    max1=a[i];
		}
			else if(a[i]>max2) {
				max2=a[i];
			    }				
			}
		System.out.println(max2);
	}
}
     