package Programme;

public class Strongno1 {

	public static void main(String[] args) {
		int n=142;
		int fact=1;
		int sum=0;
		int originalno=n;
		for(;n!=0;n/=10) {
			int last=n%10;
		 while(last>=2) {
			 fact=fact*last;
			 last--;
		 }
		 sum=sum+fact;
		 fact=1;
		}
		System.out.println(originalno==sum?"Strongno":"NotStrongno");
	}
}
