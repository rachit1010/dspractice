/*
Insert a Node at the Tail of a Linked List
Link to problem: https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 */

package com.rac.linkedlist;
import com.rac.linkedlist.Node;

public class Solution2 {

    Node Insert(Node head,int data) {
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=null;
        if(head==null)
            head=newNode; // in case empty list
        else
        {
            Node ptr=head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newNode;
        }

        return head;
    }
}
