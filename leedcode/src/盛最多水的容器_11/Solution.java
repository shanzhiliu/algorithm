package 盛最多水的容器_11;

class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                int width = j - i;
                int high = Math.min(height[i],height[j]);
                maxArea = Math.max(maxArea,width*high);
            }
        }
        return maxArea;
    }
}