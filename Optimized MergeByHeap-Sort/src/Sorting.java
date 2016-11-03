import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	
	public static void main(String[] args){
		
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++){
			a[i] = reader.nextInt();
		}
		reader.close();
		
		
		long startTime = System.nanoTime();
		Utilities.Gregsort(a);
		long elapsedTime = System.nanoTime() - startTime;
		
		
		
		System.out.println(Arrays.toString(a));
		System.out.println("Time in milliseconds: " + (elapsedTime*0.000001));
		
		boolean tellme = true;
		for(int i=0; i<a.length-1; i++){
			if(a[i]>a[i+1]){
				System.out.println("Das Array scheint nicht korrekt sortiert zu sein.");
				tellme = false;
			}
		}
		
		if(tellme){
			System.out.println("Das Array ist korrekt sortiert.");
		}
		
	}

}
