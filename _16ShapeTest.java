package assignment4;

//16th question main class
public class _16ShapeTest {
	public static void main(String[] args) {
		
		_16Shape rect = new Rectangle(5, 3);
		System.out.println("area is: "+ rect.area());
		System.out.println("perimeter is: "+ rect.perimeter());
		
		_16Shape cir = new Circle(6);
		System.out.println("area is: "+ cir.area());
		System.out.println("perimeter is: "+ cir.perimeter());
		
		_16Shape sh = new Triangle(3, 4, 5);
		System.out.println("area is: "+ sh.area());
		System.out.println("perimeter is: "+ sh.perimeter());
	}

}
