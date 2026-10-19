class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i-1] > nums[i]){
        //         int temp  = nums[i-1];
        //         nums[i-1] = nums[i];
        //         nums[i] = temp;
        //     }
        // }
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                l.add(i);
            }
        }
        return l;
    }
}