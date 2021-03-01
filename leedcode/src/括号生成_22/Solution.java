package 括号生成_22;

import com.sun.deploy.util.StringUtils;

import java.util.*;

class Solution {

    static  int count = 0;
    public List<String> generateParenthesis(int n) {

        List<String>  list = new ArrayList<>();
        generate(n * 2,"",list);
        return  list;
    }

    private void generate(int n, String string,List<String> list) {
//        System.out.println(count ++);


//        System.out.println(n);
        if( n <= 0) {

            System.out.println(string);
            boolean result =  checkStr(string);
            if (result) list.add(string);
            return;
        }


        generate(n - 1,string + ")",list);
        generate(n - 1,string + "(",list);

    }

    private boolean checkStr(String string) {

        Stack<Character> stack = new Stack<>();

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);

            if( character == '(' || character == '[' ||  character == '{' ) {

                stack.push(character);

            } else if ( character == ')' || character == ']' ||  character == '}' ){
                if(stack.isEmpty() ||  stack.pop() != map.get(character)) {
                    return  false;
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateParenthesis(3);
    }

}