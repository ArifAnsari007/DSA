class Solution {
    public long countCommas(long n) {
       if(n<1000){
        return 0;
       }
        long a = 0;
        long s = 1000;
        while(s<=n){
            a+=n-s+1;
            s*=1000;
        }
        return a;
    }
}