/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 *
 * https://leetcode-cn.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (41.02%)
 * Likes:    117
 * Dislikes: 0
 * Total Accepted:    54.1K
 * Total Submissions: 131.7K
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 
 * 示例 1:
 * 
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "race a car"
 * 输出: false
 * 
 * 
 */
class Solution {
    private static boolean isValid(char c){
        if((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z'))
            return true;
        else
            return false;
    }
    // private static int findNextValid(int head,String s)
    // {
    //     for(int i=head;i<s.length();i++)
    //     {
            
    //     }
    // }
    public boolean isPalindrome(String s) {
        if(s=="")
            return true;
        int p1=0,p2=s.length()-1,len=s.length();
        do
        {
            for(int i=p1;i<len;p1=i++)
            {
                if(isValid(s.charAt(i))){
                    break;
                }
            }
            for(int i=p2;i>=0;p2=i--){
                if(isValid(s.charAt(i))){
                    break;
                }
            }
            if(s.charAt(p1)!=s.charAt(p2))
                return false;
            p1++;
            p2--;
        }while(!(p1==len-1||p2==0));
        return true;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Solution sol=new Solution();
        System.out.println(sol.isPalindrome(s));
    }
}

