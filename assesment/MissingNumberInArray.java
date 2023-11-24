package week1.assesment;

public class MissingNumberInArray {
public static void main(String[] args) {
	int a[] = {1,2,3,4,5,7,8};
	int n = a.length+1;
	int sum = (n*(n+1))/2;
	for(int i=0;i<a.length;i++) {
		sum=sum-a[i];
	}
	System.out.println("Missing number is" + sum);
}
}
