package Programme;

import java.util.ArrayList;
import java.util.ListIterator;

public class coll {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(25);
		a1.add(26);
		a1.add(27);
        a1.add(28);
        a1.add(92);
        a1.add(84);
        
       /*for(Object k:a1) {
        	System.out.println(k);*/
        ListIterator<Integer> i=a1.listIterator();
        while(i.hasNext()) {
         int s=i.next();
         if(s==28) {
        	 i.remove();
         }   
          }
        System.out.println(a1);
        }
	}
