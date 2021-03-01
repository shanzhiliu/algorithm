package 斐波那契数_509;

import java.util.Stack;

class Solution2 {

    public int fib(int N) {
        return stackFib(N);
    }

    public int stackFib(int n) {
        Stack<Integer> stack = new Stack<>();

        stack.push(n);

        int result = 0;
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();
            if(pop <= 1) {
                result += pop;
            }
            else {
                stack.push(pop - 1);
                stack.push(pop - 2);
            }
        }
        return result;

    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int fib = solution.fib(10);
        System.out.println(fib);
    }
}