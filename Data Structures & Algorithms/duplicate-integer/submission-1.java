class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> cleanSet = new HashSet<>();

        for (int num : nums){
            if (cleanSet.contains(num)){
                return true;
            }
            cleanSet.add(num);
        }
        return false;
    }
}