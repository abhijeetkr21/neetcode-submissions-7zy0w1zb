class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray=s.toCharArray();
        Arrays.sort(sArray);
        String s1=new String(sArray);

        char[] tArray=t.toCharArray();
        Arrays.sort(tArray);
        String s2=new String(tArray);

        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
