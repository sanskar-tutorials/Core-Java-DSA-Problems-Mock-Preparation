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

    public static void main(String[] args) {
        
    }
}
