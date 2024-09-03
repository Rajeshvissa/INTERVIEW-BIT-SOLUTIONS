public class Solution {
	public long reverse(long a) {
        
        
       long [] reverse= new long  [32];
       int ind=0;
        
        while(a>0){
            
            reverse[ind]=a%2;
            ind++;
            a/=2;
        }
        
        long result=0;
        int count=31;
        
       for(int i=0;i<32;i++){
            
            result=result+((long)(Math.pow(2,count)))*(reverse[i]);
            count--;
        }
        
        
        return result;
	}
    
}