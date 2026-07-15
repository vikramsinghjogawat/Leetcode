class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int com = target-nums[i];
            if(hm.containsKey(com)){
                res[0] = hm.get(com);
                res[1] = i;
                return res;
            } 
            else hm.put(nums[i],i);
        }
        return res;
    }
}