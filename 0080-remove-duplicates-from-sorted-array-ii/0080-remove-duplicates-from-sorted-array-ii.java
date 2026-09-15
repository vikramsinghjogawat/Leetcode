class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int count=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(count<1){
                    count++;
                    i++;
                    j++;
                }
                else{
                    count++;j++;
                }
            }
            else if(nums[i]!=nums[j]){
                i++;
                count=0;
                swap(nums,i,j);
                if(j>=nums.length-1){
                    System.out.println("Returned from *");
                    return i+1;
                } 
                if(j<nums.length && nums[j+1]==nums[i]){
                    i++;
                    j++;
                    count++;
                    swap(nums,i,j);
                    j++;
                }else if(nums[j+1]!=nums[i] && j+1<nums.length){
                    j++;
                }
            }
        }
        return i+1;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}