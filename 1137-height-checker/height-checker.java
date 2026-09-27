class Solution {
    public int heightChecker(int[] nums) {
        int arr[]  = nums.clone();
        Arrays.sort(arr);
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=arr[i]){
                count++;
            }
        }
        return count;
        
    }
}