package Array;

import java.util.Scanner;

public class ArrayProblem3 {

    private static int max(int a, int b) {
        return (a > b ? a : b);
    }

    private static int maxDuplicateDistance(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            int search = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == search) {
                    res = max(j - i, res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at " + i + " index ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Minimum distance = " + maxDuplicateDistance(arr, n));
    }
}
