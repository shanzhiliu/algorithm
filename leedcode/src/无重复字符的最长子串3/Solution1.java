package 无重复字符的最长子串3;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * author lzs
 * Date 2020-09-02
 **/
public class Solution1 {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        int temp = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            String ch = Character.toString(c);

            Integer index = map.get(ch);
            if (index == null)
            {
                temp ++;
            }
            else {
                //输出字符串
//                System.out.println(s.substring(index, i));

                if (temp > max) {
                    max = temp;
                }
                //重置temp
                temp = i - index;
                //重置map
                map = new HashMap<>();
                for (int j = index + 1; j < i; j++) {
                    map.put(s.substring(j,j+1),j);
                }

            }

            map.put(ch,i);

        }

        if (temp > max) {
            max = temp;
        }


        return max;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
//        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));

    }

}
