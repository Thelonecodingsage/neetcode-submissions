class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int most = 0;
        int count = 0;
        
        for (int num : nums){
            if (num == 1){
                count++;
                most = Math.max(count, most);
            } else {
                count = 0;
            }
        }
        return most;
    }
}