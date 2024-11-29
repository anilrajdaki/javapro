package assignment4;

/*Write a Java program to create a class called "Student"
* with a name, grade, and courses
attributes, and methods to add and remove courses.*/
public class _10Student {
	String name;
	
	char grade;
	
	public _10Student(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}
	String[] courses;	
	
	public void addCourses(String[] courses) {
		this.courses = courses;
		
	}
	
	public void removeCourses(_10Student s, String courseToRemove) 
	{
	String[] newCourses = new String[s.courses.length]; //2
	int count = 0;
		for(int i = 0; i < s.courses.length; i++) {
			if(s.courses[i].equalsIgnoreCase(courseToRemove)) {
				continue;
			} 
			else {
				newCourses[count] = s.courses[i];
				count++;
			}
		}		
		s.courses = newCourses;
	}
	
	public static void main(String[] args) {
		
		_10Student s1 = new _10Student("Hari", 'A');
		String[] newCourses = {"Java", "HTML", "Python", "React"};
		s1.addCourses(newCourses);
		
		System.out.println("name : "+s1.name + " , grade : "+s1.grade);
		for(int i = 0; i < s1.courses.length ; i++) {
			System.out.println(" courses : "+s1.courses[i]);
		}
		
		s1.removeCourses(s1, "python");
		for(int i = 0; i < s1.courses.length ; i++) {  
			System.out.println(" New courses : "+s1.courses[i]);
		}
	}	
	
}
