import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char now=s.charAt(i);
            if(now=='('||now=='{'||now=='['){
                stack.add(now);
            }
            else if(!stack.empty()){
                if(now==')'&&stack.peek()=='('){
                    stack.pop();
                }
                else if(now==']'&&stack.peek()=='['){
                    stack.pop();
                }
                else if(now=='}'&&stack.peek()=='{'){
                    stack.pop();
                }
                else
                    return false;
            }
            else
                return false;
        }
        if(stack.empty())
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="()";
        System.out.println(sol.isValid(s));
    }
}