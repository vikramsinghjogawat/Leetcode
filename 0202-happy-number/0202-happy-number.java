class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0;
        int sum=0;
        while(n>0){
            n=squareSumOfDigits(n);
            
            System.out.print(n+",");
            if(n==1) return true;
            if(hm.containsKey(n)){
                return false;
            }else{
                hm.put(n,null);
            }
        }
        
        return true;
    }
    public int squareSumOfDigits(int n){
        int sum=0;
        while(n>0){
                sum+=square(n%10);
                n=n/10;
            }
        return sum;
    }
    public int square(int p){
        return p*p;
    }
}