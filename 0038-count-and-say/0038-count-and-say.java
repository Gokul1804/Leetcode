class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            s=solve(s);
        }
        return s;
    }
    public String solve(String s){
        StringBuilder sb=new StringBuilder();
        char ch = s.charAt(0);
        int k=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch){
                k++;
            }else{
                sb.append(k);
                sb.append(ch);
                ch=s.charAt(i);
                k=1;
            }
        }
        sb.append(k);
        sb.append(ch);
        return sb.toString();
    }
}