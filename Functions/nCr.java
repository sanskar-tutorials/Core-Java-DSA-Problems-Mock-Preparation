package Functions;

public class nCr {
    public static int NcR(int n , int r){
        // code here
        if(r > n) return 0;
        
        if(r == n - 1 ) return n;
        
        if(r > n - r) r = n - r;
        
        long res = 1;
        
        for(int i = 0; i < r ;i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return (int) res;
    }

    public static void main(String[] args) {
        NcR(10,8 );
    }
}
