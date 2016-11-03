package Main;
import java.util.Arrays;

public class Utilities {
	
	public static void exchange(int[] a, int i, int j){
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
	
	public static void default_quicksort(int[] a, int left, int right){
		
		if(a == null || a.length <= 1){
			return;
		}
		
		if(right-left<=1){
			if(a[left]>a[right]){
				exchange(a, left, right);
			}
			return;
		}
		
		boolean left_key = true;
		boolean right_key = true;
		
		int pivot = a[(int) Math.floor((left+right)/2)];
		int high = right;
		int low = left;
		exchange(a, (int) Math.floor((left+right)/2), high);
		right--;
		
		while(left<=right){
			
			if(left_key){
				if(a[left]>pivot){
					left_key = false;
				}
				else{
					left++;
				}
			}
			
			if(right_key){
				if(a[right]<pivot){
					right_key = false;
				}
				else{
					right--;
				}
			}
			
			if(!(left_key || right_key) && left<right){
				exchange(a, left, right);
				left_key = true;
				right_key = true;
			}
			
			//System.out.println(Arrays.toString(a));
			
		}
		
		exchange(a, left, high);
		
		
		//System.out.println(Arrays.toString(a));	
		
		if(low<left){	
			default_quicksort(a, low, left-1);
		}
		if(high>right+1){
		default_quicksort(a, left+1, high);
		}
		
		
	}
	
	public static void quicksort(int[] a){
		default_quicksort(a, 0, a.length-1);
		return;
	}
	
	
	
	

}
