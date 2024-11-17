package arrays;

public class DupliateElement {

	public static void main(String[] args) {
		int a[]= {9,19,83,27,9,27,19};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
				if (a[i]==a[j])
				count++;
			}
			if(count==1)
				System.out.println(a[i]);
		}
	}
}
