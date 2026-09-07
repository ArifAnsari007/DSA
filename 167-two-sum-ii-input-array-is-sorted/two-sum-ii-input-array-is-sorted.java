class Solution {
    public int[] twoSum(int[] arr, int target) {
       int n = arr.length;
       int left = 0;
       int right = n-1;
       while(left<right){
        if(arr[left]+arr[right]==target){
            return  new int[]{left+1,right+1};
        }
        else if(arr[left]+arr[right]<target){
            left++;
        }
        else{
            right--;
        }
       }
     return new int[]{-1,-1};
    }
 
}