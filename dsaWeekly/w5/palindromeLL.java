package dsaWeekly.w5;

import java.util.Stack;

public class palindromeLL {
    // Definition for singly linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to check if a linked list is a palindrome
    public static boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        ListNode temp2 = head;

        // Push all nodes onto the stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Compare node values while popping from stack
        while (temp2 != null) {
            if (temp2.val != stack.pop().val) {
                return false;
            }
            temp2 = temp2.next;
        }
        return true;
    }

    // Main method to test the palindrome function
    public static void main(String[] args) {
        // Creating a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(1)))));

        boolean result = isPalindrome(head);
        System.out.println("Is palindrome? " + result); // true

        // Creating a non-palindrome linked list: 1 -> 2 -> 3
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println("Is palindrome? " + isPalindrome(head2)); // false
    }
}
