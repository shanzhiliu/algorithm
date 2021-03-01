package 平方根_69;

// 1 2 3 4 5 6
class Solution3 {
    public int mySqrt(int x) {

        if(x < 2) return x;

        long left = 1;
        long right = x;
        long mid = 0;

        while (left <= right) {
            mid =  left + (right - left) / 2;
          if(mid * mid > x) {
              right = mid - 1 ;
            } else {
              left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int i = solution.mySqrt(2147395599);
        System.out.println(i);
    }
}