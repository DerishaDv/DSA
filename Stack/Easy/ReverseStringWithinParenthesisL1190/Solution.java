class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c=='(') {
                stack.push(result);
                result = new StringBuilder();
            } else if(c==')'){
                result = stack.pop().append(result.reverse());
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
