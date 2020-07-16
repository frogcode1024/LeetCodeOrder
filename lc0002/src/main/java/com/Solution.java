package com;

import java.util.*;


class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Solution {
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
