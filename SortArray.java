package tribe.assignments;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 2, 1, 7, 6, 5};
		
		System.out.println(Arrays.toString(sortMethod(arr)));

	}
	
	public static int[] sortMethod(int[] array) {
		int temp=0;
		for(int i=0 ; i<array.length-1; i++) {
			for(int j=i+1; j<array.length-1; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i]=array[j];
					array[j]= temp;
				}
			}
		}
		return array;
	}
	

}
