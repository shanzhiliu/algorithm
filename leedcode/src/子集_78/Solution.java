package 子集_78;

import com.sun.org.apache.regexp.internal.REUtil;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        generetaSubset(result,list,nums,0);

        return result;
    }

    private void generetaSubset(List<List<Integer>> result, List<Integer> list, int[] nums, int n) {

        if(n == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        generetaSubset(result,list,nums,n + 1);
        list.add(nums[n]);
        generetaSubset(result,list,nums,n + 1);

        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3});


        for (List<Integer> itemList : subsets) {

            System.out.print("[");
            for (Integer item : itemList)
            {
                System.out.print(item);
                System.out.print(",");
            }
            System.out.println("]");

        }

    }
}