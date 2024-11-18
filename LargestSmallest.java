package tribe.assignments;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,2,7,6,3,8};
		
		System.out.println(largestMethod(arr));
		
		System.out.println(smallestMethod(arr));
	}
	
	public static int largestMethod(int[] array) {
		
		int max=array[0];
		for(int i:array) {
			if(max<i) {
				max = i;
			}
		}
		return max;
	}
	
public static int smallestMethod(int[] array) {
		
		int min=array[0];
		for(int i:array) {
			if(min>i) {
				min = i;
			}
		}
		return min;
	}

}
