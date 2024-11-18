package tribe.assignments1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to revrse:");
		int n = sc.nextInt();
		int temp=0,rev=0;
		while(n!=0) {
			temp=n%10;
			rev = rev*10 + temp;
			n=n/10;
			
		}
		System.out.println("the reversed num is : "+ rev);
		sc.close();
	}

}
