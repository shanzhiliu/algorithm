package 有效的括号20;

import javax.xml.stream.XMLOutputFactory;
import java.util.*;


class Solution2 {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Set<Character> set = new HashSet<>();
        set.addAll(map.keySet());
        set.addAll(map.values());

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(set.contains(currentChar)){
                if(map.keySet().contains(currentChar)){
                    stack.push(currentChar);
                }
                else {
                    if(stack.isEmpty()) return false;
                    Character popChar = stack.pop();
                    if(currentChar != map.get(popChar)) {
                        return false;
                    }
                }

            } else {
                return false;
            }
        }

        return  stack.isEmpty();
    }

    public static void main(String[] args) {


        Solution2 solution =  new Solution2();

        System.out.println( solution.isValid("()"));
    }
}