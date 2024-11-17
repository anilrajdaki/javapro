package tribe.assignments;

public class PalindromeNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "harshsrah";
		
	    String s2 = "$&*()*&$";
	    
	    //System.out.println(reverseString(s1));
	    //System.out.println(reverseString(s2));
	    
	    
	    System.out.println("Is "+s1+" palindrome: "+isPalindrome(s1));
	    System.out.println("Is "+s2+" palindrome: "+isPalindrome(s2));

	}
	
	public static String reverseString(String inp) {
		String output = "";
		for(int i=inp.length()-1; i>=0 ; i--) {
			output = output + inp.charAt(i);
		}
		return output;
	}
	
	public static boolean isPalindrome(String inp) {
		String output = reverseString(inp);
//		boolean isPalindrome = false;
//		if(inp.equals(output)) {
//			isPalindrome= true;
//		}
		return inp.equals(output);
	}
}
