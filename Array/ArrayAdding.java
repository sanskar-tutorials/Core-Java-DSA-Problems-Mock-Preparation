package Array;

import java.util.Arrays;

public class ArrayAdding {
    static int[] calSum(int a[], int b[], int n, int m) {
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
  public static void main(String[] args) {
      int[] arr1 = {1,2,3};
      int[] arr2 = {3,2,1};
      int n = 3 , m = 3;

      int[] res = calSum(arr1, arr2, n, m);

      System.out.println(Arrays.toString(res));
  }
}
