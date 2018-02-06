/*
Link to problem --> https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 */

package com.rac.linkedlist;

public class Solution8 {

    /*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if((headA==null && headB!=null) || (headA!=null && headB==null))
            return 0;
        Node ptrA=headA; Node ptrB=headB;
        while(ptrA!=null && ptrB!=null){
            if(ptrA.data==ptrB.data) {
                ptrA = ptrA.next;
                ptrB = ptrB.next;
                continue;
            }
            else return 0;
        }

        if(ptrA==null && ptrB==null)
            return 1;
        return 0;
    }
}
