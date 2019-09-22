/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (35.71%)
 * Likes:    3105
 * Dislikes: 0
 * Total Accepted:    216K
 * Total Submissions: 604.9K
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    // public class ListNode {
    //     int val;
    //     ListNode next;
    //     ListNode(int x) { val = x; }
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1,p2=l2,rListNode=null,tail=rListNode;
        int a=0,b=0,carry=0,ans;
        do{
            a=b=0;
            if(p1!=null){
                a=p1.val;
                p1=p1.next;
            }
            if(p2!=null){
                b=p2.val;
                p2=p2.next;
            }
            ans=(a+b+carry)%10;
            carry=(a+b+carry)/10;
            ListNode nNode=new ListNode(ans);
            nNode.next=null;
            if(rListNode==null){
                rListNode=nNode;
                rListNode.next=null;
                tail=rListNode;
            }
            else{
                tail.next=nNode;
                tail=nNode;
            }
        }while(p1!=null||p2!=null);
        if(carry>0){
            ListNode nNode=new ListNode(carry);
            nNode.next=null;
            tail.next=nNode;
        }
    return rListNode;
    }
}
