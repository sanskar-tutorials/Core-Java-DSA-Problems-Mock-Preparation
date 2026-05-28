package Array;
import java.util.Scanner;
public class HackerRankProblem {
  static int[] calSum(int a[], int b[], int n, int m) {
    // Result array size can be max(n,m) + 1
        // Result array size can be max(n,m) + 1
    int[] res = new int[Math.max(n, m) + 1];

    int i = n - 1;
    int j = m - 1;
    int k = res.length - 1;
    int carry = 0;

    // Add digits from back
    while(i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if(i >= 0) {
            sum = sum + a[i];
            i--;
        }

        if(j >= 0) {
            sum = sum + b[j];
            j--;
        }
        res[k] = sum % 10;
        carry = sum / 10;
        k--;
    }

    //remove trailing 0
    // Remove leading zero if not needed
    int sz = res.length;
    if(res[0] == 0) {

        int[] ans = new int[sz - 1];

        for(int x = 1; x < sz; x++) {
            ans[x - 1] = res[x];
        }

        return ans;
    }
    return res;
      
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
