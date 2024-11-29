package assignment4;
//2nd question
public class _2Dog {
	
	String name;
	String breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public _2Dog(String name,String breed) {
		this.name = name;
		this.breed = breed;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2Dog d1 = new _2Dog("rocky ","bull");
		_2Dog d2 = new _2Dog("sam ","german shepard");
		
		System.out.println("name is: "+d1.name+" ;Breed is: "+d1.breed);
		System.out.println("name is: "+d2.name+" ;Breed is: "+d2.breed);
        
		d1.setBreed("rot veiler");
		d1.setName("jaggu");
		
		d2.setName("rams");
		d2.setBreed("conner");
		
		System.out.println("name is: "+d1.getName()+" ;Breed is: "+d1.getBreed());
		System.out.println("name is: "+d2.getName()+" ;Breed is: "+d2.getBreed());
		
		
	}

}
