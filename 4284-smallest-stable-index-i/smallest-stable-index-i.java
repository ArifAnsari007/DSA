class Solution {
    public int firstStableIndex(int[] arr, int k) {
    int idx = -1;
    for(int i=0; i<arr.length; i++){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int j = 0; j<=i; j++){
            max= Math.max(max,arr[j]);
        }
        for(int z = i; z<arr.length; z++){
            min = Math.min(min,arr[z]);
        }
        if(max-min<=k){
            idx = i;
            break;
        }
    }
   return idx;
    }
}