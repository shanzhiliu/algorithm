package 汉诺塔;

import javax.sound.midi.Soundbank;

public class Solution {


    public void hannuo(int n,String left,String mid,String right) {

        if(n < 1) return;

        hannuo(n-1,left , right,mid);
        System.out.println(left + " - > "  + right);
        hannuo(n-1,mid , left,right);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.hannuo(3,"left" , "mid","right");

    }
}
