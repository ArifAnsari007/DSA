class Solution {
    public int majorityElement(int[] nums) {
        int m = 0;
        int c=0;
        for(int x: nums){
            if(c==0){
                m=x;
                c=1;
            }
          
            else{
                 if(m==x){
                    c=c+1;
                 }
                 else{
                    c=c-1;
                }
            }
            }
            
        
        return m;
    }
}