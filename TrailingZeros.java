public class Solution {
    public int solve(int A) {
        
        int result=0;
        int k;
        
        while(A!=0){
            k=A&1;
            if(k==1){
                break;
            }
            
            result+=1;
            A=A>>1;
        }
        
        return result;
    }
}
