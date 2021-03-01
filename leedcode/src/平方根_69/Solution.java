package 平方根_69;

import sun.tools.tree.ShiftLeftExpression;

// 1 2 3 4 5 6
class Solution {
    public int mySqrt(int x) {

        if(x < 2) return x;

        long left = 1;
        long right = x;
        long mid = 0;


        while (left <= right) {

            mid =  (right + left) / 2;

            System.out.println("left --- " + left);
            System.out.println("right --- " + right);
            System.out.println("mid --- " + mid);

            if(mid * mid == x) {
                return (int) mid;
            } else if(mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1 ;
            }


        }
        return (int)(left - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.mySqrt(15);
        System.out.println(i);
    }
}