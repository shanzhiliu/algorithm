package 分发饼干_455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int indexCount = 0;
        int index1 = 0;
        int index2 = 0;

        while ( index1 < g.length && index2 < s.length)
        {
            if(g[index1] <= s[index2]) {
                indexCount ++;
                index1 ++;
                index2 ++;
            }
            else {
                index2 ++;
            }
        }

        return  indexCount;
    }


}