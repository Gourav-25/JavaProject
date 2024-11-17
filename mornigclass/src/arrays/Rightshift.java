package arrays;

public class Rightshift {
	public static void main(String[] args) {
		int a[]= {10,12,15,81,20,17};
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];		
		}
		a[0]=temp;
	for(int i:a) {
		
		System.out.println(i);
	}
  }
 }
