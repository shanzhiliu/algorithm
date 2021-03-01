package 连续子数组的最大和_剑指42;

import javax.sound.midi.Soundbank;
import java.util.spi.LocaleNameProvider;

class Solution {
    public int maxSubArray(int[] nums) {

        long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {

            long itemMax = Long.MIN_VALUE;
            long currentResult = 0;
            for (int j = i; j < nums.length; j++) {
                currentResult += nums[j];

                if(currentResult > itemMax) {
                    itemMax = currentResult;
                }
            }

            if(itemMax > max) {
                max = itemMax;
            }

        }

        return (int) max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }
}