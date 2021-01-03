

/**********************************************************************************
 2. 两数相加
 给你两个非空的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。

 请你将两个数相加，并以相同形式返回一个表示和的链表。

 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。



 示例 1：

 输入：l1 = [2,4,3], l2 = [5,6,4]
 输出：[7,0,8]
 解释：342 + 465 = 807.
 **********************************************************************************/

package com.lc;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int jin = 0;
        // 都走到头，短的那个后面补0
        while(l1!=null || l2!=null){
            int a = l1 == null ? 0:l1.val;
            int b = l2 == null ? 0:l2.val;
            int sum = jin+a+b;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            jin = sum/10;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(jin>0)
            cur.next = new ListNode(jin);

        return pre.next;
    }
}

public class LC0002 {
    public static void main(String[] args) {
        //(2 -> 4 -> 3) + (5 -> 6 -> 4)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode res = new Solution0002().addTwoNumbers(l1, l2);
        while (res != null){
            System.out.print(res.val + "->");
            res = res.next;
        }
    }
}
