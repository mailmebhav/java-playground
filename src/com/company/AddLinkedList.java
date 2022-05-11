package com.company;

public class AddLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3,new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9, new ListNode(9))))))))));
        ListNode l2 = new ListNode(7);
        AddLinkedList addLinkedList = new AddLinkedList();
        addLinkedList.print(l1);
        addLinkedList.print(l2);
        ListNode result = addLinkedList.addTwoNumbers(l1,l2);
        System.out.println(addLinkedList.print(result));
    }

    public String print(ListNode l) {
        StringBuilder s = new StringBuilder();
        while (l != null) {
            s.append(l.val);
            s.append("->");
            l = l.next;
        }
        return s.toString();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = 0;
        long num2 = 0;
        long sum = 0;
        while(l1 != null) {
            num1 = (num1 * 10) + l1.val;
            l1 = l1.next;
        }
        while(l2 != null) {
            num2 = (num2 * 10) + l2.val;
            l2 = l2.next;
        }
        sum = num1 + num2;
        System.out.println(sum);
        ListNode res = new ListNode();
        while(sum > 0) {
            res.val = (int) (sum % 10);
            sum = sum/10;
            ListNode temp = new ListNode();
            temp.next = res;
            if(sum > 0) {
                res = temp;
            }
            System.out.println(print(res));
        }
        return res;
    }
}
