class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        return a.length==0?0:a[a.length-1].length();
    }
}