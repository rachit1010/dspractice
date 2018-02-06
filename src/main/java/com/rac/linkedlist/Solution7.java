/*
Link to problem --> https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
 */

package com.rac.linkedlist;


public class Solution7 {
    Node Reverse(Node head) {
        Node ptr = head;
        Node nextNode = null;
        Node lastNode = head;
        while (ptr != null) {
            if (ptr == head) {
                nextNode = ptr.next;
                ptr.next = null;
                lastNode = ptr;
                ptr = nextNode;
            } else {
                nextNode = ptr.next;  //saved
                ptr.next = lastNode;
                lastNode = ptr;
                ptr = nextNode;
            }
            head = lastNode;
        }
        return head;
    }


}
