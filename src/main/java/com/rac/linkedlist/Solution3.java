/*
Link to problem:https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

 */

package com.rac.linkedlist;

public class Solution3 {

    Node Insert(Node head,int x) {
        Node newNode=new Node();
        newNode.data=x;
        if(head==null) {
            newNode.next = null;
            head = newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}
