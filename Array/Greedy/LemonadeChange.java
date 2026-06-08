package Array.Greedy;



//Time Complexity = O(n);
//Space Complexity = O(1);  //instead of array you can use three variables , 5s , 10s , 20s

public class LemonadeChange {
    static boolean lemonadeChange(int[] bills) {
        int[] changes = new int[3]; // 0->$5, 1->$10, 2->$20

        // Enhanced loop since we dont want to change bills or direct access of any
        // value in the loop depending on iteration
        for (int bill : bills) {

            if (bill == 5) {
                changes[0]++;
            }

            else if (bill == 10) {

                if (changes[0] == 0)
                    return false;

                changes[0]--;
                changes[1]++;
            }

            else { // bill == 20

                // Prefer giving 10 + 5
                if (changes[1] > 0 && changes[0] > 0) {
                    changes[1]--;
                    changes[0]--;
                }

                // Otherwise give 5 + 5 + 5
                else if (changes[0] >= 3) {
                    changes[0] -= 3;
                } else {
                    return false;
                }
                changes[2]++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {5,5,5,10,20};

        boolean possible = lemonadeChange(arr);
        System.out.println(possible);

    }
}
