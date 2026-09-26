class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
      
       int l = 0;
       int r = 1;
       Arrays.sort(nums);
       while(r<nums.length){
        if(nums[l]==nums[r]){
            ans.add(nums[l]);
            l+=2;
            r+=2;
        }
        else{
            l++;
            r++;
        }
       }
        return ans;
    }
}