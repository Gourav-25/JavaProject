package programme2;

public class Amstrongno {

	public static void main(String[] args) {
	int n=153;
	int originalno=n;
	int sum=0;
	for(;n!=0;n/=10) {
		int last=n%10;
		sum=sum+last*last*last;
	}
	if(sum==originalno) {
		System.out.println("Amstrongno");
	}
	else {
		System.out.println("not an Amstrongno");
	}
	}

}
