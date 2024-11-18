package tribe.assignments1;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter array values:");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The entered values are:");
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
