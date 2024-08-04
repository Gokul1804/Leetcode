class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int n = 0;
        while(n<str1.length()&&n<str2.length()){
            if(str1.charAt(n)==str2.charAt(n)){
                n++;
            }else{
                break;
            }
        }return str1.substring(0,n);
    }
}