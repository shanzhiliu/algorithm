package 有效的完全平方数_367;

class Solution {
    public boolean isPerfectSquare(int num) {

        if(num < 2) return true;

        long left = 1;
        long right = num;

        while (left <= right) {

            long mid = (left + right) / 2;
            long squareCount = mid * mid;
            if(squareCount == num) {
                return true;
            } else if(squareCount < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

}