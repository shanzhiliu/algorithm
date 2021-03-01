package 斐波那契数_509;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 用栈的记忆化  暂时拉稀了 老哥,等着后边在思考一下
 */
class Solution3 {

    public int fib(int N) {
        return stackFib(N);
    }

    public int stackFib(int n) {
        Stack<Integer> stack = new Stack<>();

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);

        stack.push(n);

        int result = 0;
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if(map.containsKey(pop)) {
                result += map.get(pop);
            }
            else {
                stack.push(pop - 1);
                stack.push(pop - 2);
            }
        }
        return result;

    }


    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int fib = solution.fib(10);
        System.out.println(fib);
    }
}