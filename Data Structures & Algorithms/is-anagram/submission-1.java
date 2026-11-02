class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        for (char i : first){
            sMap.put(i, sMap.getOrDefault(i, 0) + 1);
        }

        for (char i : second){
            tMap.put(i, tMap.getOrDefault(i, 0) + 1);
        }

        boolean match = sMap.equals(tMap);
        return match;
    }
}
