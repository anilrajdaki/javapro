package assignment4;

import java.time.LocalDate;
import java.time.Period;


public class _9Employee {
	
	String name;
	int salary;
	LocalDate hireDate;
	
	public _9Employee(String name,int salary,LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	public static void main(String[] args) {
		_9Employee e1 = new _9Employee("Anil raj",90000,LocalDate.of(2020, 12, 12));
		
        e1.experience();
		
	}
	
	public void experience() {
		System.out.println(Period.between(hireDate,LocalDate.now()).getYears());
		
	}

}
