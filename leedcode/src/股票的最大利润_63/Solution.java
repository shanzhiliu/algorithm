package 股票的最大利润_63;

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length <=1 ) return 0;

        int[] differences = new int[prices.length - 1];

        int count = 0;

        for (int i = 1; i < prices.length; i++) {

            int temp   =  prices[i] - prices[i - 1];
            differences[i - 1] =  temp;
            if(temp > 0) {
                count += temp;
            }

        }

        return count;
    }
}