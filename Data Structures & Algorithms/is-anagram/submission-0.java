class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        HashMap<Character, Integer> anagramFirst = new HashMap<>();
        HashMap<Character, Integer> anagramSecond = new HashMap<>();

        for (char c: first){
            anagramFirst.put(c, anagramFirst.getOrDefault(c, 0) + 1);
        }

        for (char c : second){
            anagramSecond.put(c, anagramSecond.getOrDefault(c, 0)+ 1);
        }

        return anagramFirst.equals(anagramSecond);
    }
}
