package PowXn_50;

import javax.sound.midi.Soundbank;

class Solution {
    public double myPow(double x, int n) {

        long nn = n;
        if( nn == 0) return 1;

        if( nn < 0) {
            nn = (-1 * nn);
            x = 1/x;
        }

        double result = powxn(x,nn);
        return  result;
    }

    private double powxn(double x, long n) {
        if( n == 1) {
            return x;
        }
        double result  = powxn(x,n/2);

        if(n % 2 == 0) return  result *  result;
        else return  result *  result  * x ;

    }

    public static void main(String[] args) {

        long test = -2147483648;

        long test2 =  -test;

        System.out.println(test2);

        Solution  solution = new Solution();

        double v = solution.myPow(1, -2147483648);

        System.out.println(v);
    }

}