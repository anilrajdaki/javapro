package tribe.assignments1;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("enter the input value to check even or odd");
		
		int input;
		
		do {
			input = sc.nextInt();
			
			if(input==0) {
				System.out.println("exiting the loop");
			}else if(input%2==0) {
				System.out.println(input +"it is even");
			}else {
				System.out.println(input +"it is odd");
			}
		}
		while(input!=0);	
		sc.close();
}
}
