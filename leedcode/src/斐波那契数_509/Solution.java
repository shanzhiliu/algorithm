package 斐波那契数_509;

import javax.sound.midi.Soundbank;
import java.util.Stack;

class Solution {
    public int fib(int N) {

        return recurFib(N);
    }

    public int recurFib(int n) {
        System.out.println(n);
        if(n <= 1) return n;
        int one = recurFib(n - 1);
        int two =  recurFib(n - 2);
        return one + two;
    }



    public static void main(String[] args) {
        Solution  solution = new Solution();
        int fib = solution.fib(2);
        System.out.println(fib);
    }
}