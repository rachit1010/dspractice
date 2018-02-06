/*
Link tom problem --> https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 */

package com.rac.linkedlist;

public class Solution9 {
    static int rac_count=0;
    static int out=999999;
    int GetNode(Node head,int n) {
        if(head==null)
            return 0;

        else{
            GetNode(head.next,n);
            if(rac_count==n)
                out = head.data;
            rac_count++;
        }
        return out;

    }


    public static void main(String[] args) {

        //Case1:
        //Node newNode=new Node(2,new Node(1,new Node(3,new Node(5,new Node(6,null)))));

        //Case2:
        //Node newNode=new Node(1,null);

        //Case3:
//        Node newNode=new Node(1,new Node(2,new Node(3,null)));


        //Case4:2 1 4 6 8 9 0
        Node newNode=new Node(2,new Node(1,new Node(4,new Node(6,new Node(8,new Node(9,new Node(0,null)))))));
        Solution9 sol=new Solution9();
        System.out.println("Answer is:->"+sol.GetNode(newNode,0));
    }
}
