class Solution {
    public int findMin(int[] nums) {
        int left = 1;
        int right = nums.length - 1;

        while (left <= right){
            if (nums[left - 1] > nums[left]){
                int result = nums[left];
                return result;
            }
            left++;
        }
        return nums[0];
    }
}
