
public class Utilities {

	public static void exchange(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void merge_by_heap_sort(int[] a){
		default_merge_by_heap_sort(a, 0, a.length-1);
	}
	
	
	public static void default_merge_by_heap_sort(int[] a, int left, int right){
		int mid = (left+right)/2;
		
		if(left<right){
			default_merge_by_heap_sort(a, left, mid);
			default_merge_by_heap_sort(a, mid+1, right);
			merge_by_heap(a, left, mid, right);
		}
		return;
	}
	
	
	public static void merge_by_heap(int[] a, int left, int mid, int right){
		build_defined_min_heap(a, mid+1, right);
			
		for(int i=left; i<mid+1; i++){
			if(a[i]>a[mid+1]){
				exchange(a, i, mid+1);
				implicit_sink_down_min(a, mid+1, right, mid+1);
			}
		}
		
	}
	
	
	public static void implicit_sink_down_min(int[] a, int start, int end, int pos){
		int supp;
		
		while(2*(pos-start+1)-1<=end-start){
			supp = (2*(pos-start+1)-1)+start;
			
			if(supp<=end-1){
				if(a[supp]>a[supp+1]){
					supp++;
				}
			}
			if(a[pos]>a[supp]){
				exchange(a, pos, supp);
				pos = supp;
			}
			else{
				return;
			}
		}
	}
	
	
	
	public static void sink_down_min(int[] a, int pos, int end){
		int supp;
		
		while(2*(pos+1)-1<=end){
			supp = 2*(pos+1)-1;
			
			if(supp+1<=end){
				if(a[supp]>a[supp+1]){
					supp++;
				}
			}
			if(a[pos]>a[supp]){
				exchange(a, pos, supp);
				pos = supp;
			}
			else{
				return;
			}
		}
	}
	
	
	public static void sink_down_max(int[] a, int pos, int end){
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
	
	
	public static void build_defined_min_heap(int[] a, int start, int end){
		for(int i=(end-start+1)/2-1; i>=0; i--){
			implicit_sink_down_min(a, start, end, i+start);
		}
	}
	
	
	public static void build_min_heap(int[] a){
		for(int i=a.length/2-1; i>=0; i--){
			sink_down_min(a, i, a.length-1);
		}
	}
	
	
	public static void build_max_heap(int[] a){
		for(int i=a.length/2-1; i>=0; i--){
			sink_down_max(a, i, a.length-1);
		}
	}
	
	
	public static void decrease_heapsort(int[] a){
		build_min_heap(a);
		
		for(int i=a.length-1; i>=1; i--){
			exchange(a, 0, i);
			sink_down_min(a, 0, i-1);
		}
		return;
	}
	
	
	public static void implicit_decrease_heapsort(int[] a, int start, int end){
		for(int i=end; i>start; i--){
			exchange(a, start, i);
			implicit_sink_down_min(a, start, i-1, start);
		}
		return;
	}

	
	public static void increase_heapsort(int[] a){
		build_max_heap(a);
		
		for(int i=a.length-1; i>=1; i--){
			exchange(a, 0, i);
			sink_down_max(a, 0, i-1);
		}
		return;
	}
	
	
	public static void implicit_sequence_flipper(int[] a, int start, int end){
		for(int i=start; i<=(start+end)/2; i++){
			exchange(a, i, start+end-i);
		}
		return;
	}
	
	
	
}
