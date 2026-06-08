package Array;

import java.util.Arrays;

public class MissingNumber {
    
    public static  int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
             if(nums[i] != i) return i;
        }

        return n;
    }

    public static int missingNumberAux(int[] nums , int N){
        int[] temp = new int[N];

        for(int i = 0; i < N; i++) {
            if(nums[i] == N) continue;
            temp[nums[i]]++;
        }

        for(int i = 0; i < N; i++) {
            if(temp[i] == 0) return i;
        }

        return N;

    }
     
    static void missingnumbers(int [] arr , int n){
        int [] freq = new int[n + 1];

        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }

        for(int i = 0 ; i < freq.length ; i++){
             if(freq[i] == 0) System.out.print(i + " ");
        }

        //Return count of all the digits 
        //Return count of digit which are repetative  / identify duplicates 
    }

    public static void main(String[] args) {
        int [] arr = {0 , 1 , 2 , 3 , 5 ,5 ,6 , 6};
        missingnumbers(arr , 8);
    }
}
