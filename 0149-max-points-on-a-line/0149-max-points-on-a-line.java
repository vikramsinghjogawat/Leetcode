class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;
        int globalMax=0;
        for(int i=0;i<points.length;i++){
            Map<Double,Integer> hm = new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i!=j){

                    double m;
                    if(points[i][0]==points[j][0])
                        m=Double.POSITIVE_INFINITY; 
                    
                    else{
                    double dy= (points[i][1]-points[j][1]);
                    double dx= (points[i][0]-points[j][0]);
                    m=dy==0?0.0:dy/dx;
                    }
                    hm.put(m,hm.getOrDefault(m,0)+1);
                }
            }
            int localMax=0;
            for(int count:hm.values()){
                localMax = Math.max(localMax,count);
            }
            globalMax=Math.max(globalMax,localMax+1);
        }
        //System.out.println(hm);
        return globalMax;
    }
}