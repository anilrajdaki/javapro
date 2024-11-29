package assignment4;

public class _6Employee {
	
	String name;
	String jobTitle;
	float salary;
	float totalSalary;
	
	void calculateSalary(float salary) {
		
		totalSalary = salary*12;
		System.out.println("the total salary is:"+totalSalary);
		
	}
	
	void updateSalary(float salary) {
		this.salary = salary;
		System.out.println("the updated salary is:"+salary);
		calculateSalary(salary);
	}
	
	
	public _6Employee(String name,String jobTitle,float salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		totalSalary = salary*12;
		System.out.println("name: "+name+" jobtitle: "+jobTitle+" salary is:"+salary);
		System.out.println("the total salary is: "+totalSalary);
	}
	
	public static void main(String[] args) {
		_6Employee e1 = new _6Employee("raj","developer",120000);
	    e1.updateSalary(40000);
	    
	    System.out.println("name: "+e1.name+" jobtitle: "+e1.jobTitle+" salary is:"+e1.salary);
        System.out.println(e1.totalSalary);

		
		
	}

}
