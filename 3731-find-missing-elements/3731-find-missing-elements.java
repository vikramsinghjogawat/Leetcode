class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        //HashSet Approach
        // Set<Integer> hs = new HashSet<>(); //S(n)
        // int max = nums[0];
        // int min = nums[0];
        // for(int num:nums){
        //     hs.add(num);
        //     if(num>max) max=num;
        //     else if(num<min) min=num;
        // }
        // for(int i=min;i<=max;i++){
        //     if(!hs.contains(i)){
        //         res.add(i);
        //     }
        // }
        //Sorting approach
        Arrays.sort(nums);
        int n=nums.length;
        for( int i=0;i<n-1;i++){
            int current = nums[i];
            int next = nums[i+1];
            for(int j=current+1;j<next;j++){
                res.add(j);
            }
        }


        return res;
    }
}