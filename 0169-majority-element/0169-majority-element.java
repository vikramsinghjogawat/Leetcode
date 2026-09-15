class Solution {
    public int majorityElement(int[] nums) {
        int leader = nums[0];
        int count =1;
        int i=1;
        while(i<nums.length){
            if(nums[i]==leader) count++;
            else{
                count--;
                System.out.println(count);
                if(count<0){
                    leader = nums[i];
                    count=0;
                }
            }
            i++;
        }
        return leader;
    }
}