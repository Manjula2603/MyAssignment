package week1.assesment;

public class Palindrome {
	public static void main(String[] args) {
		int rem,sum=0,temp;
		int n = 121;
		
		temp = n;
		
        while(n>0)
        {
        	rem = n%10;
        	sum=(sum*10)+rem;
        	n = n/10;
        	
        }
        if(temp==sum) {
        	System.out.println(sum +" is a palindrome");
        }
        else {
        	System.out.println(sum +" is not a palindroe");
        }
	}
	

}
