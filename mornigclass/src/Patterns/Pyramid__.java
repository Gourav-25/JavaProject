package Patterns;

public class Pyramid__ {

	public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++) {
		
		for(int k=n-i-1;k>=1;k--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	       }
	}
}