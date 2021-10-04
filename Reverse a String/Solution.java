class Solution {
    static String revStr(String S) {
        if(S.equals(""))
           return "";
       String x = S.substring(0,1);
       return revStr(S.substring(1)) + x;
    }
}