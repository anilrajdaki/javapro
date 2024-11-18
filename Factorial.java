package tribe.assignments1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fact(n);
		sc.close();

	}
	public static void fact(int n) {
		for(int i=n-1; i>0; i--) {
			n=n*i;
		}
		System.out.println(n);
	}

}
