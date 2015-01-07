/*
 * This is the class that handles find slices in an array of integers.
 * It has a time complexity of O(N).
 */
class Slice
{
    public int getSingleMaxSum(int [] A) //Function That Finds Max Possible Sum of Any Array Slice 
    {
		switch (A.length) //Base and Edge Cases
		{
			case 2: //Two Items in Array
				if (A[0]>0 && A[1]>0) //If Both Elements Positive
					return A[0]+A[1]; //Return Sum of Elements
				else //At Least One Element Negative or Zero
					return Math.max(A[0], A[1]); //Return Biggest Element of Two
			case 1:
			    return A[0]; //Return Only Element, Only Option
		}
		
		//General Case
		int N = A.length; //Length of Array
		int maxSum = 0; //Max Slice Sum
		int sum = 0; //Current Sum
		int max = A[0]; //Max Element in Array, Initialize to First Element
		
        for (int i=1; i<N; i++) //Find Max Element in Array
        {
            if (A[i]>max)
                max = A[i];
        }
        if (max<1) //If No Positive Elements
            return max; //Return Maximum Element (No Additions Can Increase Sum)
		for (int i=0; i<N; i++) //Loop Through Array
		{ 
			sum = Math.max(0, sum+A[i]); //Add Element to Current Sum
			maxSum = Math.max(maxSum, sum); //If Greater Than Max Sum, Update
		}
		
		return maxSum; //Return Max Slice Sum of Array
    }
}