package Array;

import java.util.Scanner;

public class ArrayProblem2 {
    public static int min(int a , int b){
        return (a > b ? a : b);
    }

    public static int arrayProblem(int[] arr , int n ){
        int res = -1;
        for(int  i = 0 ; i < n ; i++){
            int firstEven = -1;
            int ans = -1;
            if(arr[i] %2 == 0){  firstEven = i;}
            for(int j = i + 1 ; j < n ; j++){
                   if(arr[j]%2 == 0 && firstEven != -1) {
                    ans ++;
                    res = min(ans , j - firstEven);
                } 
            }   
        }
        return (res >= 0 ? res  : res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : " );
        int n = sc.nextInt();   //Discuss the next().charAt() for char input student can see the empty line evidently.
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter element at " + i + " index ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Minimum distance = " + arrayProblem(arr, n));        
    }
}
