package Main;

public class Utilities {
	
	public static int[] merge(int[] a, int[] b){
		int[] arr = new int[a.length+b.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<a.length && j<b.length){
					
			if(a[i]>=b[j]){
				arr[k] = b[j];
				j++;
			}
			else {
				arr[k] = a[i];
				i++;
			}
			
			k++;		
		}
		
		
		
		for(int t=k; t<arr.length; t++){
			if(i==a.length){
				arr[t] = b[j];
				j++;
			}
			else {
				arr[t] = a[i];
				i++;
			}
		}
		
		return arr;		
	}
	
	

	
	public static void implct_merge(int[] a, int left, int middle, int right){
		int[] arr = new int[a.length];
		int i = left;
		int j = middle;
		int k = left;
		
		while(i<middle && j<=right){
			if(a[i]>=a[j]){
				arr[k] = a[j];
				j++;
			}
			else {
				arr[k] = a[i];
				i++;
			}
			k++;
		}
		
		for(int t=k; t<arr.length; t++){
			if(i>=middle){
				arr[t] = a[j];
				j++;
			}
			else{
				arr[t] = a[i];
				i++;
			}
		}
		
		for(int c=left; c<arr.length; c++){
			a[c] = arr[c];
		}
		return;
		
	}
	
	
	public static void default_natural_mergesort(int[] a, int left, int right){
		int middle = (int) Math.floor((left+right)/2)+1;
		
		int counter1 = 0;
		int counter2 = 0;
		
		for(int i=left; i<middle-1; i++){
			if(a[i]<a[i+1]){
				counter1++;
				if(counter1 == middle-2 - left){
					return;
				}
			}
			else{
				if(left<right){
				default_natural_mergesort(a, left, middle-1);
				}
			}
		}
		for(int i=middle; i<right; i++){
			if(a[i]<a[i+1]){
				counter2++;
				if(counter2 == right-1 - middle){
					return;
				}
			}
			else{
				if(left<right){
				default_natural_mergesort(a, middle, right);
				}
			}
		}
		if(left<right){
			implct_merge(a, left, middle, right);
		}
		return;
	}
	
	

	public static void exchange(int[] a, int i, int j){
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;		
	}
	
	

}
