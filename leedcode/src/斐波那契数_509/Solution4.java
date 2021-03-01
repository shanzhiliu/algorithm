package 斐波那契数_509;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 递归带记忆,保存之前计算过的
 */
class Solution4 {

    public int fib(int N) {

        Integer[] cache = new Integer[31];
        cache[0] = 0;
        cache[1] = 1;
        return recurFib(N,cache);
    }

    public int recurFib(int n, Integer[] cache) {

        System.out.println(n);
        if (cache[n]  != null) {
            return cache[n];
        } else {
            int one = recurFib(n - 1,cache);
            int two = recurFib(n - 2,cache);
            cache[n] = one + two;
            return one + two;
        }
    }


    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int fib = solution.fib(6);
        System.out.println("result = "+ fib);
    }
}