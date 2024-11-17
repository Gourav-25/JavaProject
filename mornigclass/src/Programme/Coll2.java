package Programme;

import java.util.ArrayList;
import java.util.ListIterator;

public class Coll2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("jack");
		a1.add("jhones");
		a1.add("john");
		a1.add("Edward");
		a1.add("king");
		ListIterator<String> i=a1.listIterator();
        while(i.hasNext()) {
        	String o=i.next();
        	 if(o.equals("john")) {
        		 i.remove();
        	 }
        	 
         }
        System.out.println(a1);
        	
		}		
	}

