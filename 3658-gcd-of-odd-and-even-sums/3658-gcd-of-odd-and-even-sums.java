class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=n*n;
        int sumEven=n*(n-1);
        int smaller = sumEven<sumOdd?sumEven:sumOdd;
        for(int i=smaller;i>0;i--){
            if(sumOdd%i==0 && sumEven%i==0){
                return i;
            }
        }
        return 1;
    }
}