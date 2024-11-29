package assignment4;

public class _4Circle {
	
	void circumference(float r) {
		double cr = 2*3.14*r;
		System.out.println("circumference is: "+cr);
	}
	
	void area(float r) {
		float ar = (float) (3.14*r*r);
		System.out.println("area is : "+ar);
	}
	
	public static void main(String[] args) {
		_4Circle c1 = new _4Circle();
		c1.area(3);
		c1.circumference(3);
	}

}
