class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns){
            count+=ifFits(pattern,word);
        }
        return count;
    }
    public int ifFits(String pattern, String word){
        char k = pattern.charAt(0);
        int i=0;
        int n = pattern.length();
        while(i<word.length()){
            if(word.charAt(i)==k && (i+n)<=word.length()){
                if(word.substring(i,i+n).equals(pattern))
                    return 1;
            }
            i++;
        }
        return 0;

        //Optiimized Approach
        //for(String s:patterns){
        //  if(word.indexOf(s)!=-1) count++;
        //}
        
    }
}