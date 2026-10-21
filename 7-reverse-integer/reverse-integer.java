class Solution {
    public int reverse(int x) {
        int num=Math.abs(x);
        int rev=0;
        int max=Integer.MAX_VALUE;
        while(num!=0){
            int digit=num%10;
            if(rev>(max-digit)/10){
                return 0;
            }
            rev=rev*10+digit;
            num/=10;
        }
        return (x<0)?(-rev):rev;
    }
}