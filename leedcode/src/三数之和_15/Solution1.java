package 三数之和_15;

import java.util.*;

public class Solution1 {


    public List<List<Integer>> threeSum(int[] nums) {

        Set resultSet = new HashSet();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int target = nums[i] * -1;

            for (int j =  i+1; j < nums.length; j++) {

                int cuIndex = j;
                int cuValue = nums[j];

                int targetValue = target - cuValue;

                if(map.containsKey(targetValue)) {

                    Integer targetIndex = map.get(targetValue);
                    if(cuIndex != targetIndex && targetIndex != i)
                    {
                        List itemResult = new ArrayList();
                        itemResult.add(cuValue);
                        itemResult.add(targetValue);
                        itemResult.add(nums[i]);
                        Collections.sort(itemResult);
                        resultSet.add(itemResult);
                    }

                }
                else {
                    map.put(cuValue, cuIndex);
                }

                }

        }

        return new ArrayList<>(resultSet);

    }


    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] test = {-3,2,1,4,-4,0};

        List<List<Integer>> lists = solution.threeSum(test);

        for(List<Integer> item : lists){
            for(Integer temp : item) {
                System.out.println(temp);
            }
        }

    }





}
