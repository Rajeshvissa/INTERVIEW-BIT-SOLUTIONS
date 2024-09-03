public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        ArrayList<Integer>list1=new ArrayList<>();
        int curr;
        int k=0;
        
        for(int i=0;i<A.size();i++){
            
            curr=A.get(i)
            
            if(list1.contains(curr)){
                list1.add(k,curr);
                k++;
            }
            else{
                
                list1.add(curr);
            }
        }
    }
}
