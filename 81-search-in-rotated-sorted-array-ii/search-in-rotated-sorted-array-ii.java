class Solution {
    public boolean search(int[] nums, int target) {
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            if(target==nums[i]){
                flag = true;
            }
        }
        return flag;
    }
}