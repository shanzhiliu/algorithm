package 括号生成_22;

import javax.sound.midi.Soundbank;
import java.util.*;

class Solution2 {
    public List<String> generateParenthesis(int n) {

        List<String>  list = new ArrayList<>();
        generate(n,0,0,"",list);
        return  list;
    }

    private void generate(int n,int left,int right, String string,List<String> list) {

        if( left == n && right == n) {
            list.add(string);
            return;
        }

        if(left < n)
        generate(n,left + 1,right,string + "(",list);
        if(left > right)
        generate(n,left,right + 1,string + ")",list);

    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        List<String> list = solution.generateParenthesis(3);

        list.forEach(s -> System.out.println(s));
    }

}