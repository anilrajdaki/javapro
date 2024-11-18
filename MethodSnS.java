package tribe.assignments1;

public class MethodSnS {
	static int staticvariable = 10;
	
	int nonstaticvariable = 20;
	
	public static void staticMethod() {
		System.out.println("this is static method "+ staticvariable);
		
	}
	
	public void nonStaticMethod() {
		System.out.println("this is non static method "+ nonstaticvariable);
	}

}
