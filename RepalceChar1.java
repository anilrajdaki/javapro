package tribe.assignments;

import java.util.Scanner;

public class RepalceChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "The weather is veryy cool here";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some string: ");
		String s2 = sc.nextLine();
		replaceString(s2);
		replaceString(s1);
		sc.close();

	}
	
	public static void replaceString(String string) {
		
		
		String s2 = string.replace("yy","@");
		
		System.out.println(s2.replace("oo","@"));
		
	}
	
	

}
