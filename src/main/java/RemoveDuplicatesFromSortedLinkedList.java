package main.java;

public class RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLinkedList removeDuplicatesFromSortedLinkedList = new RemoveDuplicatesFromSortedLinkedList();
        int[] nums = {1, 1, 2, 3, 3};
        ListNode head = removeDuplicatesFromSortedLinkedList.createLinkedList(nums);
        removeDuplicatesFromSortedLinkedList.printLinkedList(head);
        ListNode res = removeDuplicatesFromSortedLinkedList.deleteDuplicates(head);
        System.out.println("");
        removeDuplicatesFromSortedLinkedList.printLinkedList(res);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public ListNode createLinkedList(int[] nums) {
        ListNode head = new ListNode();
        ListNode temp = head;
        for(int i = 0; i < nums.length; i++) {
            temp.val = nums[i];
            if(i != nums.length - 1) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return head;
    }

    public void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            if(head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
    }
}
