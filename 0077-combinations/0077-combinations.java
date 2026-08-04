class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        res.add(new ArrayList<>());//Added seed array
        combination(arr,res);
        return res.stream().filter(e->e.size()==k).toList();
    }
    public List<List<Integer>> combination(int[] arr, List<List<Integer>> res){
        
        for(int num:arr){
            int size = res.size();
            for(int i=0;i<size;i++){
                List<Integer> newList = new ArrayList<>(res.get(i));
                newList.add(num);
                res.add(newList);            
            }
        }
        return res;
    }
}