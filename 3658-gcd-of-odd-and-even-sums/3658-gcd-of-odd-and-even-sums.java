class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=0;i<=n*2;i++){
            if(i%2==0) sumEven+=i;
            else sumOdd+=i;
        }
        int smaller = sumEven<sumOdd?sumEven:sumOdd;
        for(int i=smaller;i>0;i--){
            if(sumOdd%i==0 && sumEven%i==0){
                return i;
            }
        }
        return 1;
    }
}