package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int [] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5 ,3 , 1 ,4 ,6};

        System.out.println(Arrays.toString(arr));

        int n = 5;
        for(int i  = 0 ; i <  n ; i++){
            for(int j = i ; j < n  ; j++){
                  if(arr[j] < arr[i]){
                    swap(arr , i , j);
                    System.out.println(Arrays.toString(arr));
                  }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
