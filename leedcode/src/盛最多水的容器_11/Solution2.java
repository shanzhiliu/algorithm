package 盛最多水的容器_11;

class Solution2 {
    public int maxArea(int[] height) {

        int maxArea = 0;
        int j = height.length -1;
        for (int i = 0; i < j;) {
            int minHeight =  height[i] > height[j] ? height[j--] : height[i++];
            maxArea = Math.max(maxArea,(j - i + 1) * minHeight);
        }
        return maxArea;
    }
}