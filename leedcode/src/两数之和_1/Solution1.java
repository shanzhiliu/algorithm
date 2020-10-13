package 两数之和_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Phaser;

public class Solution1 {


    public int[] twoSum(int[] nums, int target) {


        int[] result = new  int[2];

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            int cuIndex = i;
            int cuValue = nums[i];

            int targetValue = target - cuValue;

            if(map.containsKey(targetValue)) {
                result[0] = map.get(targetValue);
                result[1] = cuIndex;
                return result;
            }
            else{
                map.put(cuValue,cuIndex);
            }
        }

        return  result;
    }


    public static void main(String[] args) {

        Solution1 solution = new Solution1();

        int[] test = {3,2,4,678};

        int[] ints = solution.twoSum(test, 6);

        System.out.println(Arrays.toString(ints));

    }





}
