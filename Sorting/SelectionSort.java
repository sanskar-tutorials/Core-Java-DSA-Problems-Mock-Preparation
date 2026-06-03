package Sorting;
import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {5 , 3 , 1 , 2 , 6};
        int n = 5;

        System.out.println(Arrays.toString(arr));
    
        for(int i = 0 ; i < n ; i++){
            int minIdx = i;
            for(int j = i + 1 ; j < n ; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr , i , minIdx);
            System.out.println(Arrays.toString(arr));
            
        }

        System.out.println(Arrays.toString(arr));
    }
}
