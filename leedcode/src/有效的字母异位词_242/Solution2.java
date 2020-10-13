package 有效的字母异位词_242;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character cuChar = s.charAt(i);
            Integer cuCount = map.get(cuChar) == null ? 1 :  map.get(cuChar) + 1;
            map.put(cuChar,cuCount);
        }

        for (int i = 0; i < t.length(); i++) {

            Character cuChar = t.charAt(i);
            Integer cuCount = map.get(cuChar);

            if(cuCount == null) return  false;

            if(cuCount == 1)  {
                map.remove(cuChar);
            }
            else {
                map.put(cuChar,cuCount - 1);
            }


        }

        return map.isEmpty();


    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.isAnagram("ada","aad"));
    }

}