package 有效的字母异位词_242;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("ada","aad"));
    }

}