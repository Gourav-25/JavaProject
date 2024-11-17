package arrays;

public class Countperfect {
	public static void main(String[] args) {
		int a[]= {9,28,29,16,12,97,103},count=0;
		for(int temp:a) {
			if(isperfect(temp))
				count++;
			}
		System.out.println(count);
		}
		public static boolean isperfect(int n) {
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0)
					sum=i;
			}
			return sum==n;
		}	
	}
