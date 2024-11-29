package assignment4;

public class _8TrafficLight {
	String color;
	
	public void changeColor(String color) {
		this.color = color;
	}
	
	
	public boolean isGreen() {
		return (this.color).equals("Green");
	}
	public static void main(String[] args) {
		_8TrafficLight t = new _8TrafficLight();
		t.color = "Red";
		
		System.out.println("Is green "+t.isGreen());
	}
}
