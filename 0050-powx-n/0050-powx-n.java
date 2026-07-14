class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1 ) return 1;
        if(x==-1 && n%2==0)  return 1;
        if(x==-1 && n%2==1)  return -1;
        if(n<-10000 && x>0) return 0;
        double res = 1;
        long p=n;
        if(n<0) p=n*-1;
        for(int i=0;i<p;i++){
            res*=x;
        }
        if(n<0) return 1.0/res;
        return res;
        
    }
}