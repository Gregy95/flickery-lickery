
public class Utilities {

	public static void exchange(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void sink_down(int[] a, int pos, int end){
		int supp;
		
		while(2*(pos+1)-1<=end){
			supp = 2*(pos+1)-1;
			
			if(supp+1<=end){
				if(a[supp]<a[supp+1]){
					supp++;
				}
			}
			if(a[pos]<a[supp]){
				exchange(a, pos, supp);
				pos = supp;
			}
			else{
				return;
			}
		}
	}
	
	
	public static void build_heap(int[] a){
		for(int i=a.length/2-1; i>=0; i--){
			sink_down(a, i, a.length-1);
		}
	}
	
	public static void heapsort(int[] a){
		build_heap(a);
		
		for(int i=a.length-1; i>=1; i--){
			exchange(a, 0, i);
			sink_down(a, 0, i-1);
		}
		return;
	}
	
	
	
}
