/*
Link to problem
 */

package com.rac.linkedlist;
import com.rac.linkedlist.Node;

public class Solution5 {
    Node Delete(Node head, int position) {
        // Complete this method
        Node ptr=head;
        if(position==0)
        {
            head=head.next;
        }
        else{
            Node ptrLast=head;
            while(position!=0){
                ptrLast=ptr;
                ptr=ptr.next;
            }
            ptrLast.next=ptr.next;
        }
        return head;

    }
}
