class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int i=0;
        int res=0;
        while(i<s.length()){
            Character c = s.charAt(i);
            if(c=='M') res+=hm.get('M');
            else if(c=='D') res+=hm.get('D');
            else if(c=='C'){
                if(i+1<s.length() && 'D'==s.charAt(i+1)){
                    res+=400;i++;
                }else if(i+1<s.length() && 'M'==s.charAt(i+1)){
                    res+=900;i++;
                }else{
                    res+=hm.get('C');
                }
            }else if(c=='L'){
                res+=hm.get('L');
            }
            else if(c=='X'){
                if(i+1<s.length() && 'L'==s.charAt(i+1) ){
                    res+=40;i++;
                }else if(i+1<s.length() && 'C'==s.charAt(i+1) ){
                    res+=90;i++;
                }else{
                    res+=hm.get('X');
                }
            }
            else if(c=='V'){
                res+=hm.get('V');
            }
            else if(c=='I'){
                if(i+1<s.length() && 'V'==s.charAt(i+1)){
                    res+=4;i++;
                }else if(i+1<s.length() && 'X'==s.charAt(i+1)){
                    res+=9;i++;
                }else{
                    res+=hm.get('I');
                }
            }
            i++;
        }
        return res;
    }
}