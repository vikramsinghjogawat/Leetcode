class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]<0){
        //         nums[i]=nums[i]*-1;
        //     }
        // }
        //PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Arrays.sort(nums);
        int res1 = nums[0]*nums[1]*nums[n-1];
        int res2 = nums[n-1]*nums[n-2]*nums[n-3];
        // for(int k:nums)
        //     System.out.print(k+" ");
        return res1>=res2?res1:res2;
    }
}