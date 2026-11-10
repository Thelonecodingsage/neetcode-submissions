class Solution {
    public boolean isValid(String s) {
        Stack<Character> symbols = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '('){
                symbols.push(')');
            }
            else if (c == '{'){
                symbols.push('}');
            }
            else if (c == '['){
                symbols.push(']');
            }
            else if (symbols.isEmpty() || symbols.pop() != c){
                return false;
            }
        }
        return symbols.isEmpty();
    }
}
