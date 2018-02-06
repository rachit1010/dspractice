/*
https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */

/*
  Solution1 elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission.
// You only need to complete this method.



package com.rac.linkedlist;
import com.rac.linkedlist.Node;

public class Solution1 {


    void Print(Node head) {
        Node ptr=head;
        if(ptr== null);
        else
            while(ptr!=null)
            {
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
    }


    public static void main(String[] args) {
        Node node1=new Node(11,new Node(22,new Node(33,new Node(44,null))));
        Solution1 sol=new Solution1();
        sol.Print(node1);
    }
}





