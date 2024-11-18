package tribe.assignments1;

import java.util.Scanner;

public class IntetoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer type value");
		int a = sc.nextInt();
		
		System.out.println("enter byte value:");
		byte b = sc.nextByte();
		
		System.out.println("enter short value:");
		short c = sc.nextShort();
		
		System.out.println("enter long value:");
		long d = sc.nextLong();
		
		System.out.println("enter float value: ");
		float e = sc.nextFloat();
		
		System.out.println("enter double value: ");
		double f = sc.nextDouble();
		
		String inte = String.valueOf(a);
		String byt = String.valueOf(b);
		String sho = String.valueOf(c);
		String lon = String.valueOf(d);
		String flo = String.valueOf(e);
		String dou = String.valueOf(f);
		
		System.out.println(inte);
		System.out.println(byt);
		System.out.println(sho);
		System.out.println(lon);
		System.out.println(flo);
		System.out.println(dou);
		
		sc.close();

	}

}
