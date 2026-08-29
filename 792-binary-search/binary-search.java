class Solution {
    public int search(int[] nums, int target) {
        int f= 0;
        int l = nums.length-1;
        while(f<=l){
            int mid = (f+l)/2;
            if(target>nums[mid]){
                f=mid+1;
            }
            else if(target<nums[mid]){
                l=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}