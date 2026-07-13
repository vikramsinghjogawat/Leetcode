class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr_sum=0;
        for(int num: gain){
            curr_sum+=num;
            if(curr_sum>max) max=curr_sum;
        }
        return max;
    }
}