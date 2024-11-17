package arrays;

public class Rightshift2 {
	public static void main(String[] args)
	{
		int a[]= {17,10,15,20,14,12};
		int temp=a[a.length-1];
		for(int p=1;p<=2;p++) {
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}
		}
		a[0]=temp;
		 for(int i:a)
			 System.out.println(i);
	}
}
