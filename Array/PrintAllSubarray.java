package Array;

public class PrintAllSubarray {

    public static void print(int [] arr , int start , int end){
        for(int i = start ; i <= end ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void printAllSubarray(int[] arr , int n){
       for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                print(arr, i, j);
            }
        }
    }
    
    public static void main(){
         int [] arr = { 1 , 2 , 3 , 4 , 5};
         printAllSubarray(arr, arr.length);
    }
}
