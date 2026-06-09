class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] result = new int[k];

        for (int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            int maxKey = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
            result[i] = maxKey;
            freq.remove(maxKey);
        }
        return result;
    }
}
