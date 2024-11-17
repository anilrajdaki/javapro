package tribe.assignments;

public class CompareEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Anil Raj");
		
		String s2 = "Anil Raj";
		String s3 = "Anil Raj";
		
		String s4 = new String("Anil Raj");
		
		System.out.println(s1==s2); // compare memory addresses gives false
		System.out.println(s2==s3); // created in constatnt pool referenced to same value
		System.out.println(s1.equals(s2)); //compares the content
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		

	}

}
