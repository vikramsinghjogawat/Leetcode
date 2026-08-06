class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int res=productOfDigits(i);
            if(res%t==0){
                return i;
            }
        }
        return 1;
    }
    public int productOfDigits(int n){
        int product=1;
        while(n>0){
            int r=n%10;
            n=n/10;
            product*=r;
        }
        return product;
    }
}