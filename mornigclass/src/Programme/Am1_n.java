package Programme;

public class Am1_n {

	public static void main(String[] args) {
		int n=200;
		int sum=0;
	for(int i=1;i<=n;i++) {
		int o=i;
		for(;o!=0;o/=10) {
			int last=o%10;
			sum=sum+(last*last*last);
		}
	if(o==sum) {
		System.out.println(o);
	     }
	  }
	}
} 