package week1.assesment;

public class Fibonacci {

	public static void main(String[] args) {
		int n=0;
		int m=1;
		int sum=0;
		
		for(int i=2;i<10;i++) {
			sum=n+m;
			System.out.println(""+ sum);
			n=m;
			m=sum;
		}
	}
}
