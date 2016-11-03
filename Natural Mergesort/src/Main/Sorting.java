package Main;
import java.util.Scanner;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args){
		
		
		
		
		Scanner reader = new Scanner(System.in);
		int na = reader.nextInt();
		int[] a = new int[na];
		for(int i=0; i<a.length; i++){
			a[i] = reader.nextInt();
		}
		reader.close();
		
		long startTime = System.nanoTime();
		mergesort(a);
		System.out.println(Arrays.toString(a));
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime);
	}
	
	public static void mergesort(int[] a){
		Utilities.default_natural_mergesort(a, 0, a.length-1);
	}
}
