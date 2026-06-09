class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagram = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if (!anagram.containsKey(key)) {
                anagram.put(key, new ArrayList<>());
            }
            anagram.get(key).add(word);
        }
        return new ArrayList<>(anagram.values());
        // return nested ArrayList
    }
}
