class Solution {
    public int findPeakElement(int[] nums) {
        int min = nums[0];
         
        for(int i=0; i<nums.length; i++){
            if(min<nums[i]){
                min = nums[i];
              
            }

        }
       int ans=0;
       for(int i=0; i<nums.length; i++){
        if(min==nums[i]){
            ans=i;
        }
       }
       return ans;
    }
}