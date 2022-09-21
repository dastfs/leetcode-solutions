package Easy;

import java.util.Stack;

//#20
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {

        if (s == null)
            return false;

        if (s.length() == 0)
            return true;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            switch(c){
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }


}
