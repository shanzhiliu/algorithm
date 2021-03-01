package 斐波那契数_509;

class Solution5 {
    public int fib(int N) {
        if(N < 2) return N;

        int fir = 0;
        int sec = 1;

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            result = fir + sec;
            fir = sec;
            sec = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int fib = solution.fib(4);
        System.out.println(fib);
    }
}