package tribe.assignments1;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string 1:");
		String s1 = sc.nextLine();
		
		System.out.println("EAnter the string 2:");
		String s2 = sc.nextLine();
		
		String s3 = s1.concat(" ").concat(s2);
		System.out.println("the concatenated string is: "+ s3);
		
		sc.close();

	}

}
