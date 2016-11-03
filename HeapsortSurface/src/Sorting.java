import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;


public class Sorting {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = reader.nextInt();
		}
		reader.close();
		
		
		long startTime = System.nanoTime();
		Utilities.heapsort(a);
		long elapsedTime = System.nanoTime() - startTime;
		
		System.out.println(Arrays.toString(a));
		System.out.println("Time in milliseconds: " + (elapsedTime*0.000001));
	}

}
