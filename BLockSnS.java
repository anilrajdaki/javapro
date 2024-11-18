package tribe.assignments1;

public class BLockSnS {
	
	static {
		System.out.println("this is static block it is called when the class is loaded");
	}
	
	public BLockSnS() {
		System.out.println("the constructor is called after the object creation");
	}
	
	{
		System.out.println("this is non static block it is called when the object is created");
	}
	
	
	void displayMessage() {
		System.out.println("this display message");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BLockSnS bs = new BLockSnS();
		
		System.out.println("after 1st object creation");
		
		bs.displayMessage();
		
		BLockSnS bs1 = new BLockSnS();
		
		System.out.println("after 2nd object created");
		
		bs1.displayMessage();
		
		

	}

}
