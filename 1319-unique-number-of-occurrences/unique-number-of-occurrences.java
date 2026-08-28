class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
       boolean visited[]  = new boolean[n];
       int freq[] = new int[n];
       int fre =0;
       boolean flag =true;
       for(int i=0; i<n; i++){
        if(visited[i]){
            continue;
        }
        int count=1; 
        for(int j=i+1; j<n; j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j]= true;
            }

        }
         freq[fre++] = count;
       }
       for(int i=0; i< fre; i++){
        for(int j=i+1; j< fre; j++){
             if(freq[i]==freq[j]){
               return false;
             }
        }
       }
    return true;
    }
}