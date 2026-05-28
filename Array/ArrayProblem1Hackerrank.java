package Array;
import java.util.Scanner;
public class ArrayProblem1Hackerrank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
        int sum = arr[0];
        int maxi = arr[0];
        for(int i = 1 ; i < n ; i++){
            sum+= arr[i];
            if(arr[i] > maxi){
                maxi = arr[i];
            }
            
        }
        
        int avg = sum / n;
        
        System.out.print(sum + " " + avg + " " + maxi);
    }
}
