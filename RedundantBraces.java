public class Solution {
    public int braces(String A) {
        int result=0;
        int flag=0;
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<A.length();i++){
            flag=0;
            if(A.charAt(i)==')'){
                while(stack.peek()!='('){
                    if(stack.peek()=='+' || stack.peek()=='-' || stack.peek()=='*' || stack.peek()=='/'){
                        flag=1;
                    }
                    stack.pop();
                }
                stack.pop();
                if(flag!=1){
                    return 1;
                }
            }
            else if(A.charAt(i)=='+' || A.charAt(i)=='-' || A.charAt(i)=='*' || A.charAt(i)=='/' || A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }
    }
            return result;
        }
        
    }

