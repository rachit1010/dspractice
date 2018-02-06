/*
Link to problem --> https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 */

package com.rac.linkedlist;

public class Solution10 {

    /*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

    boolean hasCycle(Node head) {
        boolean isCyclic=false;
        Node tortoise=head;
        Node rabbit=head;
        while(rabbit.next!=null||tortoise!=null)
        {
            rabbit=rabbit.next.next;
            tortoise=tortoise.next;
            if(rabbit==tortoise)
                isCyclic=true;
        }
        return isCyclic;
    }

}
