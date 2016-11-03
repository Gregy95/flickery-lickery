package Main;
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
		
		long StartTime = System.nanoTime();
		Utilities.quicksort(a);
		long EndTime = System.nanoTime();
		long DurationNS = EndTime - StartTime;
		long DurationMS = DurationNS/(long)Math.pow(10, 6);
		
		System.out.println(Arrays.toString(a));
		System.out.println("The Duration in milliseconds is: " + DurationMS);
		
		
	}

}
