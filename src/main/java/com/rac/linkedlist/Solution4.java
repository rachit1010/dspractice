/*
Link: https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
 */

package com.rac.linkedlist;

public class Solution4 {
    Node InsertNth(Node head, int data, int position) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node newNode=new Node();
        newNode.data=data;
        if(position==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            int count=0;
            Node ptr=head;
            Node ptrLast=head;
            while(count!=position){
                ptrLast=ptr;
                ptr=ptr.next;
                count++;
            }

            ptrLast.next=newNode;
            newNode.next=ptr;

        }
        return head ;
    }

}
