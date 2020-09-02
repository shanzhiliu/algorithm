package 无重复字符的最长子串3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * description
 * author lzs
 * Date 2020-09-02
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int start = -1;
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);

            if (map.containsKey(c))
            {
                 start = Math.max(start,map.get(c)) ;
            }

            max = Math.max(max, i - start);

            map.put(c,i);

        }

        return max;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        System.out.println(solution.lengthOfLongestSubstring("abba"));
//        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));

    }

}
