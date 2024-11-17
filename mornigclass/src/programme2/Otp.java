package programme2;
import java.util.Scanner;
public class Otp {
      public static void main(String[] args)
      {     
    	  Scanner s=new Scanner(System.in);
    	  System.out.println("Enter a no");
    	  long Otp=s.nextLong(),count=0;
    	  while(Otp>0)
    	  {
    		  count++;
    		  Otp/=10;
    	  }
    	  if(count==6)
    	  {
    		  System.out.println("valid");
    	  }
    	  else
    	  {
    		  System.out.println("Invalid");
    	  }
        }
  }
