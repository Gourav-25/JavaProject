package arrays;

public class Merge {

	public static void main(String[] args) {
		int a[]= {12,15,14,16};
		int b[]= {15,18,19,20};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) 
				c[i]=a[i];
				else
					c[i]=b[i-a.length];
			
		System.out.print(" "+c[i]);
		}
	}
}


