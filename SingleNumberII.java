public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int[] arr1=new int[32];
        
        int temp;
        int k;
        int p=0;
        int result=0;
        
        for(int i=0;i<A.size();i++){
            
            temp=A.get(i);
            
            for(int j=31;j>=0;j--){
                
                k=temp&1;
                arr1[j]=arr1[j]+k;
                temp=temp>>1;
                
            }
        }
        
        for(int i=31;i>=0;i--){
            if(arr1[i]%3!=0){
                result=result+((int)Math.pow(2,p));
            }
            p++;
        }
        
        return result;
    }
}
