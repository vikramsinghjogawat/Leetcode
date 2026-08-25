class Solution {
    public int missingMultiple(int[] nums, int k) {        
        
        Set<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        if(nums.length==1 && !hs.contains(k)) return k;
        if(nums.length==1 && hs.contains(k)) return k+k;
        int p=1;
        int num=1;
        for(p=1;p<=nums.length;p++){
            num = p*k;
            System.out.println("=="+num);
            if(!hs.contains(num) ){
                return num;
            }
        }
        return num+k;

    }
}