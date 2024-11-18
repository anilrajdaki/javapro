package tribe.assignments;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {12,1,5,7,34,6,12,8,12,12,4,6,12};
		subArray(array, 12);

	}
	public static void subArray(int[] array, int value) {
		boolean isAdded = false;
		for(int i=0; i<array.length;i++) {
			                                   //i = 1
			for(int j=i+1;j<array.length;j++) {
				                                         //j = 2
				int sum = array[i]+array[j];
				                                                //5+7
				if(!isAdded && array[i] == value) {
					int[] val = {array[i]};
					System.out.print(Arrays.toString(val));
					isAdded = true;
				}
				else if(!isAdded && array[j] == value) {
					int[] val = {array[j]};
					System.out.print(Arrays.toString(val));
					isAdded =true;
				}
				
				else if(value == sum) {
					int[] val = {array[i], array[j]};
					System.out.print(Arrays.toString(val));
				}
			}
		}
	}


}
