package Array;

//Que link : https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class MaxSubarrayDivisibleByK {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0; 
        for(int i = 0 ; i < k ; i++){
            sum += arr[i];
        }
        int maxSum = sum;
        if( k == arr.length) return maxSum;
        int j = 0;
        for(int i = k ; i < arr.length ; i++){
              sum= sum - arr[j];
              sum+= arr[i];
              maxSum = Math.max(maxSum , sum);
              j++;
        }
        
        return maxSum;
    }
}
