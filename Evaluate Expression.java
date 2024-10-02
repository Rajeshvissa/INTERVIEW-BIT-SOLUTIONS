public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer>stack=new Stack<>();
        String curr;
        int x1;
        int x2;
        for(int i=0;i<A.size();i++){
            curr=A.get(i);
            if(curr.equals("+")){
                x1=stack.pop();
                x2=stack.pop();
                stack.push(x2+x1);
            }
            else if(curr.equals("-")){
                x1=stack.pop();
                x2=stack.pop();
                stack.push(x2-x1);
            }
            else if(curr.equals("*")){
                x1=stack.pop();
                x2=stack.pop();
                stack.push(x2*x1);
            }
            else if(curr.equals("/")){
                x1=stack.pop();
                x2=stack.pop();
                stack.push(x2/x1);
            }
            else{
                stack.push(Integer.parseInt(curr));
            }
        }
        return stack.pop();
    }
}
