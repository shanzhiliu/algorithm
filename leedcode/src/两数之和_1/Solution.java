package 两数之和_1;

import com.sun.codemodel.internal.JArray;

import java.util.Arrays;

public class Solution {


    public int[] twoSum(int[] nums, int target) {


        int[] result = new  int[2];


        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                if(i != j) {
                    if(nums[i] + nums[j] == target){
                        result[0] = i;
                        result[1] = j;
                        return result;

                    }
                }

            }
        }

        return  result;
    }


    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] test = {3,2,4,678};

        int[] ints = solution.twoSum(test, 6);

        System.out.println(Arrays.toString(ints));

    }





}
