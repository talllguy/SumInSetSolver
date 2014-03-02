import java.util.Arrays;
import java.util.Scanner;


public class SumInSetSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // set up scanner to take various inputs throughout
		int n = getN(sc); // get the n by method
		int x = getX(sc); // get the x by method
		int[] set = new int[n]; // declare a set
		set = getSetValues(n, sc);
		Boolean determine = test(set,x);
		if (determine == true)
			System.out.println("There are two elements in the set whose sums equal " + x);
		else
			System.out.println("There are not any elements in the set whose sums equal " + x);
		sc.close();
	}

	private static int getN(Scanner sc) {
		
		System.out.println("Enter 'n' (number of real numbers in set): ");
		int n = sc.nextInt();
		return n;
		
	}
	
	private static int getX(Scanner sc) {
		System.out.println("Enter 'x' (number to determine if sum equals): ");
		int x = sc.nextInt();
		return x;
	}
	
	private static int[] getSetValues(int n, Scanner sc) {
		int[] array = new int[n];
		System.out.println("Enter " + n + " real numbers:");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}
	
	public static boolean test(int[] array, int x) 
	{
	    Arrays.sort(array);

	    int i = 0;            // index of first element.
	    int j = array.length - 1; // index of last element. 

	    while(i<j)
	    {
	        // check if the sum of elements at index i and j equals x, if yes we are done.
	        if(array[i]+array[j] == x)
	            return true;
	        // else if sum if more than x, decrease the sum.
	        else if(array[i]+array[j] > x)
	            j--;
	        // else if sum is less than x, increase the sum.
	        else
	            i++;
	    }
	    // failed to find any such pair..return false. 
	    return false;
	}

}
