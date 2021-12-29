package Serires;

public class ReverseNumber {

	public static void main(String[] args) {
		int n =12415;
		int temp=n;
		int rem;
		int rev=0;
		while(temp!=0) {
			rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
System.out.println(rev);

	}

}
