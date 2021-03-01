package 跳跃游戏_55;

import java.util.Arrays;

class Solution2 {
    public boolean canJump(int[] nums) {

        if(nums.length < 2) return true;

        int max = nums.length - 1;

        int index = nums[0];

        for (int i = 0; i <= index; i++) {

            if(i > max) {
                return false;
            }

            int maxi = nums[i] + i;

            if(maxi > index && index < max) {
                index = maxi;
            }

            if(maxi >= max) {
                return  true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        boolean b = solution.canJump(new int[]{1,1,0,1});

        System.out.println(b);
    }
}