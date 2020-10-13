package 三数之和_15;

import java.util.*;

public class Solution {


    public List<List<Integer>> threeSum(int[] nums) {

        Set resultSet = new HashSet();

        for (int i = 0; i < nums.length; i++) {

            for (int j =  i+1; j < nums.length; j++) {

                for (int k = j+1; k < nums.length; k++) {

                    List<Integer> itemResultList = new ArrayList<>();

                    if(nums[i] + nums[j] + nums[k] == 0 ) {
                        itemResultList.add(nums[i]);
                        itemResultList.add(nums[j]);
                        itemResultList.add(nums[k]);
                        Collections.sort(itemResultList);

                        resultSet.add(itemResultList);
                    }

                }

            }


        }

        return new ArrayList<>(resultSet);

    }


    public static void main(String[] args) {

//        Solution solution = new Solution();
//
//        int[] test = {-3,2,1,4,-4,0};
//
//        List<List<Integer>> lists = solution.threeSum(test);
//
//        for(List<Integer> item : lists){
//            for(Integer temp : item) {
//                System.out.println(temp);
//            }
//        }

    }





}
