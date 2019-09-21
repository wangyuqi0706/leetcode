class Solution {
    public int strStr(String haystack, String needle) {
        int head=0;
        if(needle.length()==0)
            return 0;
        if(haystack.equals(needle))
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                head=i;
                for(int k=1;k<needle.length();k++){
                    if(haystack.charAt(k+head)!=needle.charAt(k)){
                        break;
                    }
                    else if(k==needle.length()-1)
                        return head;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        String haystack="a",needle="a";
        System.out.println(s.strStr(haystack, needle)); 
    }
}