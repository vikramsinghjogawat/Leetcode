class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        int max = nums[0];
        int min = nums[0];
        for(int num:nums){
            hs.add(num);
            if(num>max) max=num;
            else if(num<min) min=num;
        }
        for(int i=min;i<=max;i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        System.out.println(res);
        return res;
    }
}