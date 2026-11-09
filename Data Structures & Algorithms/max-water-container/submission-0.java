class Solution {
    public int maxArea(int[] heights) {
        
        int max_level = 0;
        int container = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right){
            container = Math.min(heights[left], heights[right]) * (right - left);
            max_level = Math.max(container, max_level);

            if (heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }
        }
        return max_level;
    }
}
