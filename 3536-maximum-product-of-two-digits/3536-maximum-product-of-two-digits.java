class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int d=n;
        while(d>0){
            int r=d%10;
            d=d/10;
            list.add(r);
        }
        Collections.sort(list);
        Integer max1 = list.get(list.size()-1);
        Integer max2 = list.get(list.size()-2);
        return max1*max2;
    }
}