package Array.Greedy;

import java.util.Arrays;

/*

Time Complexity : O(nlog(n)) + O(mlog(m)) = O(nlog(n)) + O(mlog(m)) + O(n);
Space Complexity : O(1)

if sorted arrays are given then time complexity will be O(n);
*/

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;
        //Since we are asked to check for the no. of child thus condition comes first , have to increment the cookie if the previous smaller child is not satistifed , if previous smaller is not satisfied next wont be too so not incrementing the child outside the if statement
        while(child < g.length && cookie < s.length){

            if(s[cookie] >= g[child]){
                child++;
            }

            cookie++;
        }

        return child;
}
}
