package 三数之和_15;

import java.util.*;


public class Solution2 {


    public List<List<Integer>> threeSum(int[] nums) {

        Set resultSet = new HashSet();
        //排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int k = i;
            int left = k + 1;
            int right = nums.length - 1;

            //stop 1
            if(nums[k] > 0) break;

            //step2
//            if(nums[k] == nums[k+1]) continue;

            for(;left < right;) {

                int cuValue = nums[k] + nums[left] + nums[right];

                if(cuValue < 0) {
                    left ++;
                } else if (cuValue > 0) {
                    right --;
                } else {

                    List itemResultList = new ArrayList();
                    itemResultList.add(nums[k]);
                    itemResultList.add(nums[left]);
                    itemResultList.add(nums[right]);
                    resultSet.add(itemResultList);
                    left ++;
                    right--;
                }

            }

        }

        return new ArrayList<>(resultSet);

    }


    public static void main(String[] args) {

        Solution2 solution = new Solution2();

        int[] test = {-1,0,1,2,-1,-4};

        List<List<Integer>> lists = solution.threeSum(test);

        for(List<Integer> item : lists){
            for(Integer temp : item) {
                System.out.println(temp);
            }
        }

    }





}
