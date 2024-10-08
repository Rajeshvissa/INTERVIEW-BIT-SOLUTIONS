public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer>list1=new ArrayList<>();
        // result.add(-1);
        Stack<Integer>stack=new Stack<>();
        int k;
        for(int i=0;i<A.size();i++){
                  while((!stack.isEmpty()) && (A.get(i)<=stack.peek())){
                      stack.pop();
                  }
                  if(stack.isEmpty()){
                      list1.add(-1);
                  }
                  else{
                  list1.add(stack.peek());
                  }
                  stack.push(A.get(i));
              }
        return list1;
    }
}
