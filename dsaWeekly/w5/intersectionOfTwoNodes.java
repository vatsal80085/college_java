package dsaWeekly.w5;

import java.util.HashSet;
class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }
public class intersectionOfTwoNodes {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        ListNode temp2= headB;
        while(temp2!=null){
            if(set.contains(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
    
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;
    
        ListNode headB = new ListNode(99);
        headB.next = common;
    
        intersectionOfTwoNodes obj = new intersectionOfTwoNodes();
        ListNode result = obj.getIntersectionNode(headA, headB);
    
        System.out.println(result != null ? "Intersection at: " + result.val : "No intersection");
    }
    
}

