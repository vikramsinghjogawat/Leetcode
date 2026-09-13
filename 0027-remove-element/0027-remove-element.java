class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        if(nums.length==0) return 0;
        if(nums.length<=1 && nums[0]!=val) return 1;
        if(nums.length<=1 && nums[0]==val) return 0;
        int p =0;

        while(i<j){
            
            while(nums[i]!=val){
                if(i>=nums.length-1) return nums.length;
                i++;
            }
            while(nums[j]==val && j>0){
                j--;
            }
            if(i>=j) break;
            System.out.println(nums[i]+""+nums[j]);
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            

        }
        return i;

    }
}