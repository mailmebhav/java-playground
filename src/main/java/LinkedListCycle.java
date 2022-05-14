package main.java;

public class LinkedListCycle {
    public static void main(String[] args) {
//        head = [3,2,0,-4], pos = 1
        ListNode tempNode = new ListNode();
        ListNode listNode = new ListNode();
        listNode = tempNode;
        tempNode.val = 3;
        tempNode.next = new ListNode();
        tempNode = tempNode.next;
        tempNode.val = 2;
        tempNode.next = new ListNode();
        tempNode = tempNode.next;
        tempNode.val = 0;
        tempNode.next = new ListNode();
        tempNode = tempNode.next;
        tempNode.val = -4;
        tempNode.next = listNode.next.next;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean res = linkedListCycle.hasCycle(listNode);
        System.out.println(res);
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        } else {
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow)
                    return true;
            }
        }

        return false;
    }
}
