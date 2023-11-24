package week1.assesment;

public class Primenumber {
	public static void main(String[] args) {
		    int n=15;
			int m=n/2;
				for(int num=1;num<=m;num++)
				{
					if(n%num==0) {
						System.out.println(num +"is a prime number");
					}
					else {
						System.out.println(num +"is not a prime number");
					}
				}
	}
}