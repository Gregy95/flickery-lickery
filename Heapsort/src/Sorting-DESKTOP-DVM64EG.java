import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i]=reader.nextInt();
		}
		reader.close();
		
		Utilities.build_max_heap(a);
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
