package Programme;

public class Strongno {

	public static void main(String[] args) {
   int n=145;
   int Originalno=n;
   int fact=1;
   int sum=0;
   for(;n!=0;n/=10) {
	   int last=n%10;
	  
	   while(last>=2) {
		   fact=fact*last;
		   last--;		   
	   }
	   sum=sum+fact;
	   fact=1;
   }
   System.out.println(sum==Originalno?"Strong no":"Not a Strong no");
	}
}
