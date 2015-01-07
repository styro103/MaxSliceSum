import java.util.Scanner;

/*
 * Shaun Mbateng
 * Max Slice Sum
 * This program finds that max possible sum of any
 * 		slice of a given array of integers.
 * It has a time complexity of O(N).
 */

public class MaxSliceSum 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		int len; //Length of Array
		int [] arr; //Array of Integers
		int sngSum; //Max Single Slice Sum
		Slice Values = new Slice(); //Class With Function that Finds Max Slice
		
		//Enter and Set Array Length
		System.out.print("Enter the Number of Integers: ");
		len = cin.nextInt();
		arr = new int [len];
		System.out.println();
		
		//Fill Arrays
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Integer Value "+(i+1)+": ");
			arr[i] = cin.nextInt();
		}
		
		cin.close(); //No More Inputs Needed
		sngSum = Values.getSingleMaxSum(arr); //Get Max Sum for Single Slice
		System.out.println(); //Print Line Space
		
		//Print Results
		System.out.println("The maximum possible single slice sum is "+sngSum+".");
	}
}