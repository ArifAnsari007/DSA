class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int i = 0;
        int j = 0;
        long pro = 1;
        int count = 0;
        while(j<nums.length){
            pro = pro*nums[j];
            while(pro>=k){
                pro /=nums[i];
                i++;
            }
            count = count+(j-i+1);
            j++;
        }
        return count;
    }
}