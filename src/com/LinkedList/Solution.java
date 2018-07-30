package com.LinkedList;


import java.util.Stack;

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<Integer> stack=new Stack<>();
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;
        ListNode prev=dummyHead;
        for(int i=1;i<m;i++){
            prev=prev.next;
            head=head.next;
        }
        //ListNode stackPoint=prev;
        for (int i=m;i<=n;i++){
            stack.push(head.val);
            head=head.next;
        }
        while(!stack.isEmpty()){
            ListNode node=new ListNode(stack.pop());
            prev.next=node;
            prev=prev.next;
        }
        prev.next=head;
        return dummyHead.next;

    }
}