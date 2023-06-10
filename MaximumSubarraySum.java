import java.util.* ;
import java.io.*; 

public class MaximumSubarraySum{
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here

		long max_so_far = Integer.MIN_VALUE;
        long max_ending_here = 0;

        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        long max_subarray_sum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + max_subarray_sum);
    }
}
	

    

