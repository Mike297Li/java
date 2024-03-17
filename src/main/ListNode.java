package main;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

 class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);

        // Move the pointer of the longer list by the difference in lengths
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Move both pointers simultaneously until they meet
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // Return the intersecting node (or null if no intersection)
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        IntersectionLinkedList solution = new IntersectionLinkedList();

        // Construct linked lists
        // List 1: 3 -> 7 -> 8 -> 10 -> 11
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node10 = new ListNode(10);
        ListNode node11 = new ListNode(11);

        node2.next=node3;
        node3.next = node7;
        node7.next = node8;
        node8.next = node10;
        node10.next = node11;

        // List 2: 99 -> 1 -> 8 -> 10 -> 11
        ListNode node99 = new ListNode(99);
        ListNode node1 = new ListNode(1);

        node99.next = node1;
        node1.next = node8; // Intersection point

        // Find intersection node
        ListNode intersectionNode = solution.getIntersectionNode(node2, node99);

        if (intersectionNode != null) {
            System.out.println("Intersection Node Value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
