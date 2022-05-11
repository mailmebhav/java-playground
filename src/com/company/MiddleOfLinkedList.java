package com.company;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode head = middleOfLinkedList.createLinkedList(arr);
        middleOfLinkedList.printLinkedList(head);
        ListNode res = middleOfLinkedList.middleNode(head);
        System.out.println("");
        middleOfLinkedList.printLinkedList(res);
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode();
        ListNode temp = head;
        for (int i = 0; i < nums.length; i++) {
            temp.val = nums[i];
            if (i != nums.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return head;
    }

    public void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
}
