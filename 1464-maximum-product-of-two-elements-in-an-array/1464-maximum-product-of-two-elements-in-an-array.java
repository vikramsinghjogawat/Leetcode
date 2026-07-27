class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        for(int i:nums){
            if(max1<i){
                max2=max1;
                max1=i;
            }else if(max2<i){
                max2=i;
            }
        }
        //System.out.println(max1+"-"+max2);
        return (max1-1)*(max2-1);
    }
}