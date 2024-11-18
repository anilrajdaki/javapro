package tribe.assignments1;

import java.util.Scanner;

public class SubStrIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a STring to find subString:");
		String s1 = sc.nextLine();
		
		System.out.println("enter the start index:");
		int startIndex = sc.nextInt();
		
		System.out.println("Enter the end index:");
		int endIndex = sc.nextInt();
		
		if(startIndex<0 || endIndex>=s1.length() || endIndex<startIndex) {
			System.out.println("invalid entered");
		}else {
		
		    String s2 = s1.substring(startIndex, endIndex);
		
	        System.out.println("the sub string is : "+s2);
	   
		}
		sc.close();

	}

}
