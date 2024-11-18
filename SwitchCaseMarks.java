package tribe.assignments1;

import java.util.Scanner;

public class SwitchCaseMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the grade (A, B, C, D):");
		Scanner sc = new Scanner(System.in);
		
		char grade = sc.next().toUpperCase().charAt(0);
		sc.close();
		
		switch(grade) {
			case 'A':
				System.out.println("Remarks: Excellent");
				break;
			
			case 'B':
				System.out.println("Remarks: Good");
				break;
				
			case 'C':
				System.out.println("Remarks: Medium");
				break;
			
			case 'D':
				System.out.println("Remarks: Fail");
				break;
				
			default:
				System.out.println("Invalid grade entered ");
				break;
		}

	}

}
