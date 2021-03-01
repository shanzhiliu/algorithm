package 两数之和_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution3 {


    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int otherValue = target - currentValue;
            if (map.containsKey(otherValue)){
                result[0] = map.get(otherValue);
                result[1] = i;
                return result;
            }
            map.put(currentValue,i);
        }

        return result;
    }


    public static void main(String[] args) {

        Solution3 solution = new Solution3();

        int[] test = {3,2,4,678};

        int[] ints = solution.twoSum(test, 6);

        System.out.println(Arrays.toString(ints));

    }





}
