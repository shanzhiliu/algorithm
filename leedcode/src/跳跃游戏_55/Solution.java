package 跳跃游戏_55;

import java.util.Arrays;

class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length < 2) return true;

        int[] maxs = new int[nums.length];

        int max = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            maxs[i] = nums[i] + i;
        }

        System.out.println(Arrays.toString(maxs));
        int index = maxs[0];

        for (int i = 0; i <= index; i++) {

            if(i > max) {
                return false;
            }

            if(maxs[i] > index && index < max) {
                index = maxs[i];
            }

            if(maxs[i] >= max) {
                return  true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean b = solution.canJump(new int[]{1,1,0,1});

        System.out.println(b);
    }
}