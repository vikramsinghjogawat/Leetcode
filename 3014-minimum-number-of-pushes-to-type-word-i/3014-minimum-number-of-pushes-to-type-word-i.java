class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int totalPushes = 0;
        for(int i=0;i<len;i++){
            int pushes = (i/8)+1;
            totalPushes+=pushes;
        }
        return totalPushes;
    }
}