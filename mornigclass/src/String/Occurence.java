package String;

public class Occurence {
      
 public static void main(String[] args) {
               String s="GouravGupta".toLowerCase();
               char c[]=s.toCharArray();
               for(int i=0;i<c.length;i++) {
            	   int count=0;
            	   for(int j=0;j<=i;j++) {
            	   if(c[i]==c[j])
            	    count++;
            	   }
            	   if(count==2) {
            	   System.out.println(c[i]);        
            	   }
               }
	}
}
