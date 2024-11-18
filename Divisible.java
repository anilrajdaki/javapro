package tribe.assignments1;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the given range from 1 to: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(i%7==0) {
				if(i%5==0) {
					continue;
				}
				else {
				   System.out.println(i);
			    }
		    }
		}
		sc.close();

	}

}
