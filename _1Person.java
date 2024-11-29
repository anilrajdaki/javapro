package assignment4;
//1st question
public class _1Person {
	String name;
	int age;
	
	_1Person(String name,int age) {
		this.name = name;
		this.age = age;
		//System.out.println("my name is "+name+" and my age is:"+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1Person pr = new _1Person("Anil", 23);
		_1Person pr1 = new _1Person("Raj", 18);
		System.out.println("my name is "+pr.name+" and my age is:"+pr.age);
		System.out.println("name is "+pr1.name+"and age is: "+pr1.age);
        
	}

}
