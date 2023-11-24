package week1.assesment;

public class Findintersection {
	public static void main(String[] args) {
	
		int a[] = {4,9,1,5,11};
		int b[] = {2,5,1,7,9};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if (a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
