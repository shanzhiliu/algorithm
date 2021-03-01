package 平方根_69;

// 1 2 3 4 5 6
class Solution2 {
    public int mySqrt(int x) {

        if(x < 2) return x;

        long left = 1;
        long right = x;
        long mid = 0;


        while (left <= right) {

            mid =  (right + left) / 2;

            System.out.println("-- 处理前----");
            System.out.println("left --- " + left);
            System.out.println("right --- " + right);
            System.out.println("mid --- " + mid);
            System.out.println("------");


            if(mid * mid == x) {
                return (int) mid;
            } else if(mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1 ;
            }

            System.out.println("-- 处理后----");
            System.out.println("left --- " + left);
            System.out.println("right --- " + right);
            System.out.println("------");



        }
        return (int)right;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int i = solution.mySqrt(8);
        System.out.println(i);
    }
}