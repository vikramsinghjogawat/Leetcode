class Solution {
    public int trailingZeroes(int n) {
        if(n==0) return 0;
        int count1 = 0;
        while(n>0){
            if(n%5==0){
                count1++;
            }
            if(n%25==0){
                count1++;
            }
            if(n%125==0){
                count1++;
            }
            if(n%625==0){
                count1++;
            }
            if(n%3125==0){
                count1++;
            }
            n--;
        }
        return count1;
    }
}