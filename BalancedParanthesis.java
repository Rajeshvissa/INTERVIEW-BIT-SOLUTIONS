public class Solution {
    public int solve(String A) {
        Stack<String>stack=new Stack<>();
        char curr;
        for(int i=0;i<A.length();i++){
            curr=A.charAt(i);
            if(curr=='('){
                stack.push("(");
            }
            else{
                if(!stack.isEmpty()){
                stack.pop();
                }
                else{
                    return 0;
                }
            }
        }
        if(stack.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
