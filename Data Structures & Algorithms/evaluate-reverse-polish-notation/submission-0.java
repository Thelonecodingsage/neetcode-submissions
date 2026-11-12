class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for (String token : tokens){
            if (token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if (token.equals("-")){
                int sub1 = stack.pop();
                int sub2 = stack.pop();
                stack.push(sub2 - sub1);
            }
            else if (token.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if (token.equals("/")){
                int div1 = stack.pop();
                int div2 = stack.pop();
                stack.push(div2 / div1);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }        
        return stack.peek();
    }
}
