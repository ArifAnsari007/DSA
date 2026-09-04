class Solution {
    public int arrayPairSum(int[] arr) {
       Arrays.sort(arr);
       int Esum=0;
       for(int i=0; i<arr.length; i+=2){
        Esum+=arr[i];
       }
    return Esum;
    }
}