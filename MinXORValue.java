public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        int min_value=Integer.MAX_VALUE;
        Collections.sort(A);
        
        for(int i=0;i<A.size()-1;i++){
            
            min_value=Math.min(A.get(i)^A.get(i+1),min_value);
        }
        
        return min_value;
    }
}
