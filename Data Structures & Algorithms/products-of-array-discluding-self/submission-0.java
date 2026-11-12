class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        int initial = 1;
        for (int i = 0; i < nums.length; i++){
            answer[i] = initial;
            initial *= nums[i];
        }

        initial = 1; // 1,
        for (int i = nums.length - 1; i >= 0; i--){
            answer[i] *= initial;
            initial *= nums[i];
        }
        return answer;
    }
}  
