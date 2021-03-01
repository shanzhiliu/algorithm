package 买卖股票的最佳时机3_123;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length <=1 ) return 0;

        int[] differences = new int[prices.length - 1];


        for (int i = 1; i < prices.length; i++) {
            int temp   =  prices[i] - prices[i - 1];
            differences[i - 1] =  temp;
        }

        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < differences.length; i++) {

            if(differences [i] > 0) {
                count += differences[i];
            }
            else {
                if(count > 0) {
                    list.add(count);
                }
                count = 0;
            }
        }
        if(count > 0) {
            list.add(count);
        }

        Collections.sort(list);

        count = 0;
        if(list.size() < 2) {
            if(list.size() < 1) return 0;

            return list.get(0);
        }
        else {
            count = list.get(list.size() -1) +  list.get(list.size() -2);
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int i = solution.maxProfit(new int[]{1,2,4,2,5,7,2,4,9,0});

        System.out.println(i);
    }
}