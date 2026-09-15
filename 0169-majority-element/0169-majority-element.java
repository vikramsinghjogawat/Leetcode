class Solution {
    public int majorityElement(int[] nums) {
        int leader = nums[0];
        int count =0;
        int i=0;
        while(i<nums.length){
            if(count==0) leader=nums[i];
            if(nums[i]==leader) count++;
            else count--;
            i++;
        }
        return leader;
    }
}