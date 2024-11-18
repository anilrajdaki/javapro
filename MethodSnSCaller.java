package tribe.assignments1;

public class MethodSnSCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSnS.staticMethod();
		
		System.out.println(MethodSnS.staticvariable);
		
		MethodSnS ms = new MethodSnS();
		
		ms.nonStaticMethod();
		
		System.out.println(ms.nonstaticvariable);

	}

}
