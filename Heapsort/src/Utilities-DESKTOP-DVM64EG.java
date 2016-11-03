
public class Utilities {




	public static void build_max_heap(int[] a){
		
		for(int j=a.length/2 -1; j>=0; j--){
			if(a[j*2]>a[j] || a[j*2+1]>a[j]){
				if(a[j*2]>=a[j*2+1]){
					exchange(a, j, j*2);
				}
				else{
					exchange(a, j, j*2+1);
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	public static void bottom_up_max_heapify(int[] a){
		
			
		
	}
	
	public static void exchange(int[] a, int i, int j){
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	
	
}