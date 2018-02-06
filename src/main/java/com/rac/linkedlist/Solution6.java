/*
Link to problem --> https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
 */

package com.rac.linkedlist;

public class Solution6 {
    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        if(head==null)
            return;
        else{
                ReversePrint(head.next);
                System.out.println(head.data);

        }
    }
}
