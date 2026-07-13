class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        Map<Integer,Integer> hm = new HashMap<>();
        int rank = 1;
        for(int i:a){
            if(!hm.containsKey(i)){
                hm.put(i, rank);
                rank++;
            }
            
        }
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=hm.get(arr[i]);
        }
        return res;
    }
}