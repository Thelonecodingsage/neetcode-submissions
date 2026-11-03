class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        
        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            groups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
