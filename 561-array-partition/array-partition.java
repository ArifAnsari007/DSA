class Solution {
    public int arrayPairSum(int[] arr) {
       Arrays.sort(arr);
       int Esum=0;
       for(int i=0; i<arr.length; i++){
         if(i%2==0){
         Esum+=arr[i];
         }
       }
    return Esum;
    }
}