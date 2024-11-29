package assignment4;
//3rd question
public class _3Rectangle {
	
	void perimeter(int height,int width) {
		int peri = 2*(height+width);
		System.out.println("Perimeter is: "+peri);
	}
	
	void area(int height,int width) {
		int ar = height*width;
		System.out.println("Area is: "+ar);
	}
	
	public static void main(String[] args) {
		_3Rectangle rc = new _3Rectangle();
		rc.area(3, 4);
		rc.perimeter(3, 4);
	}

}
