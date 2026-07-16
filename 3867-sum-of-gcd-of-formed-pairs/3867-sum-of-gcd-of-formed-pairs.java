class Solution {
    public long gcdSum(int[] nums) {
        int n= nums.length;
        int[] max = new int[n];
        int m = nums[0];
        int[] prefixGcd = new int[n];
        //max so far
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m) m=nums[i];
            max[i]=m;
            prefixGcd[i]=findGcd(nums[i],max[i]);
        }
        //sorted prefixGcd
        Arrays.sort(prefixGcd);
        //making pairs and finding gcd
        long sum=0;
        for(int i=0;i<nums.length/2;i++){
            sum+=findGcd(prefixGcd[i],prefixGcd[n-1-i]);
        }
        return sum;
    }

    public int findGcd(int a, int b){
    if(b==0) return a;
    return findGcd(b,a%b);    
    }
}