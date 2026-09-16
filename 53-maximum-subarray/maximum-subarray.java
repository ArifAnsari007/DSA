class Solution {
    public int maxSubArray(int[] nums) {

        //Approach1

        // int n = nums.length;
        // int maxsum = nums[0];
        // int sum = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     sum = Math.max(nums[i],sum + nums[i]);
        //     maxsum = Math.max(sum,maxsum);
        // }

        // return maxsum;

        //Approach 2
       int bestending = nums[0];
       int ans = nums[0];
       for(int i=1; i<nums.length; i++){
        int  v1 = bestending+nums[i];
        int v2 = nums[i];
        bestending = Math.max(v1,v2);
        ans = Math.max(bestending,ans);
       }
       return ans;
    }
}