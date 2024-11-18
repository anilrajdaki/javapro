package tribe.assignments1;

import java.util.Scanner;

public class CompareValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the three values to be compared");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("the greatest number is :"+ a);
		}else if(b>c && b>a) {
			System.out.println("the greatest number is :"+ b);
		}else {
			System.out.println("the greatest number is :"+c);
		}
		
		if(a<b && a<c) {
			System.out.println("the smallest number is :"+ a);
		}else if(b<c && b<a) {
			System.out.println("the smallest number is :"+ b);
		}else {
			System.out.println("the smallest number is :"+c);
		}
		
		sc.close();
				

	}

}
