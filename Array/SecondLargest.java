package Array;
import java.util.Scanner;

public class SecondLargest {
    public static void SecondLargest(int[] arr, int n) {
    int largest = Integer.MIN_VALUE;
    int secLargest = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++) {
        // New largest found
        if(arr[i] > largest) {
            secLargest = largest;
            largest = arr[i];
        }
        // Update second largest
        else if(arr[i] > secLargest && arr[i] != largest) {
            secLargest = arr[i];
        }
    }
    System.out.println(secLargest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
