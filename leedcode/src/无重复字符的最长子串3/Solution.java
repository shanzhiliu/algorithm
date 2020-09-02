package 无重复字符的最长子串3;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * author lzs
 * Date 2020-09-02
 **/
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            map = new HashMap<>();

            int temp = 0;
            for (int j = i; j <s.length(); j++) {

                char c = s.charAt(j);
                String ch = Character.toString(c);

                if (map.get(ch) == null)
                {
                    temp ++;
                }
                else
                {
                    break;
                }

                map.put(ch,1);

            }

            if(temp > max){
                max = temp;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lengthOfLongestSubstring("\"\""));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));

    }

}
