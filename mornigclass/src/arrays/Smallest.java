package arrays;

public class Smallest {

	public static void main(String[] args) {
	    int a[]= {12,14,7,256,8};
	    int min=a[0];
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]<min)
	    		min=a[i];
	    }
        System.out.println(min);
	}
}
