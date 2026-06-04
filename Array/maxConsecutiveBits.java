package Array;


//Que : https://www.geeksforgeeks.org/problems/max-consecutive-one/1
public class maxConsecutiveBits {
   
    public int maxConsecBits(int[] arr) {
        // code here
        int prevBit = arr[0];
        int i = 0;
        int maxLen = 1;
        for(int j = 1 ; j < arr.length ; j++){
           if(prevBit == arr[j]){
               maxLen = Math.max(maxLen , j - i + 1);
           }else{
               prevBit = arr[j];
               i = j ;
           }
           
        }
        
        return maxLen;
    }
}
