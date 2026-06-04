package Array;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int n = nums.length;

        for(int i=0 ; i < n ; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
    public static void main(String[] args) {
        int [] arr= {1 , 35, 8 ,5634 ,6 , 8 , 34 };
        int val = 8;
        removeElement(arr , val);
    }
}
