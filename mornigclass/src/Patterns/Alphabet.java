package Patterns;

public class Alphabet {

	public static void main(String[] args) {
		int n=5;
		char c='z';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(c-- +" ");			
			}
			System.out.println();
		}

	}

}
