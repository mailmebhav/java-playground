package com.company;

public class MergeNodesBetweenZeroes {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode node = new ListNode();
        int[] list = {0, 24, 14, 0};
        int i = 1;
        head.val = list[0];
        node = head;
        while (i < list.length) {
            ListNode newNode = new ListNode();
            newNode.val = list[i];
            head.next = newNode;
            head = newNode;
            i++;
        }

        head = node;
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
            if (head != null) {
                System.out.print("->");
            }
        }

        head = node;

        MergeNodesBetweenZeroes mergeNodesBetweenZeroes = new MergeNodesBetweenZeroes();
        ListNode root = mergeNodesBetweenZeroes.mergeNodes(head);


        System.out.println("\nResult");
        //        root = temp;
        while (root != null) {
            System.out.print(root.val);
            root = root.next;
            if (root != null) {
                System.out.print("->");
            }
        }
    }

    public static ListNode mergeNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        int tempSum = 0;
        ListNode temp = new ListNode();
        ListNode root = head;
        temp = root;
        while (head.next != null) {
            tempSum = 0;
            head = head.next;
            while (head.val != 0) {
                tempSum += head.val;
                head = head.next;
            }
            temp.val = tempSum;
            if (head.next == null) {
                    temp.next = null;
                return root;
            }
            temp.next = new ListNode();
            temp = temp.next;
        }

        return root;


//        ListNode l1, h = new ListNode(0);
//        l1 = h;
//        int sum = 0;
//        while (head.next != null) {
//            sum = 0;
//            head = head.next;
//            while (head.val != 0) {
//                sum += head.val;
//                head = head.next;
//            }
//            h.val = sum;
//            if (head.next == null) {
//                return l1;
//            }
//            h.next = new ListNode();
//            h = h.next;
//        }
//        return l1;
    }
}
