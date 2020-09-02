package 有效的括号20;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');


        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else {

                //栈最上边的元素
                if(stack.size() == 0) return false;
                Character top = stack.pop();

                if(map.get(top) != c)
                {
                    return false;
                }

            }
        }

        if(stack.size() == 0) return true;

        return  false;
    }

    public static void main(String[] args) {


        Solution solution =  new Solution();

        solution.isValid(")");
    }
}