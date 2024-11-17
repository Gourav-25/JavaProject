package arrays;

public class Occurence {

	public static void main(String[] args) {
	int a[]= {12,14,17,15,12,14,15,17,18};
	int b[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		int count=0;	
		for(int j=0;j<=i;j++) {
			if(a[i]==a[j]) {
				count++;
			}
		}
		if(count==1)
		b[i]=a[i];
	  }	
	for(int temp:b) {
		if(temp!=0) {
			int count=0;
			for(int k:a) {
				if(temp==k)
					count++;
			}
		
       System.out.println(temp+" "+"is present"+" "+count+" "+"times");		
	}	
      	}
          }
              }