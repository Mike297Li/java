package main.java.com.example.demo;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    // Existing methods...
    Node head;

    public LinkedList() {
        head = null;
    }
    // Method to remove duplicates without using a temporary buffer
    public static void removeDuplicatesWithoutBuffer(Node head) {
        if (head == null) return;
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    public static void removeDuplicatesWithoutBuffer2(Node head) {
       if(head==null) return;
       Node current=head;
       // 为什么外圈的循环不用 while(current.next!=null)
       while (current!=null){
           Node runner=current;
           // 为什么runner不会为null?
           while (runner.next!=null){
               if(runner.next.data==current.data){
                   runner.next=runner.next.next;
               }else {
                   runner=runner.next;
               }
           }
           current=current.next;
       }
    }

    public static void addTail(int last,Node head){
       Node end=new Node(last);
       while (head.next!=null){
           head=head.next;
       }
       head.next=end;
    }

    public static Node deleteOneNode(int num,Node head){
        if(head==null) return null;
        Node n=head;
        if(n.data==num){
            return head.next;
        }
        while (n.next!=null){
            if(n.next.data==num){
                n.next=n.next.next;
                return head;
            }
            n=n.next;
        }
        return head;
    }


    public static Node addBeginning(int begin,Node head){
        Node be=new Node(begin);
        be.next=head;
        return be;
    }

    public static Node findKthToLast(Node head, int k) {
        if (head == null || k < 1) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null; // If the list has less than k nodes
            }
            fast = fast.next;
        }

        // Move both pointers at the same pace until fast pointer reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


    public static void addMiddle(int last,Node head){
        Node middle=new Node(last);
        while (head.next!=null){
            if(head.data==12){
                head.next=middle;
                middle.next=head.next;
            }else {
                head=head.next;
            }
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // why this method to reverse a linked list?

    public static Node reverseLinkedList(Node head) {
       Node prev=null;
       Node current=head;
       Node next=null;
       while (current!=null){
           // save next
           next=current.next;
           // reverse
           current.next=prev;
           // advance prev & current
           prev=current;
           current=next;
       }
       return prev;
    }

    // Function to reverse the linked list
    static Node reverse(Node node) {
        if(node==null || node.next==null){
            return node;
        }
        Node reversedList=reverse(node.next);

        // Reverse the connections: Current node's next node should point back to the current node
        node.next.next = node;
        node.next = null;

        // Return the new head of the reversed list
        return reversedList;
    }


    public static boolean isPalindrom(Node head){
       if(head==null || head.next==null){
           return true;
       }
       Node current=head;
       // find length
        int length=0;
       while (current!=null){
           length++;
           current=current.next;
       }
        Node current2=head;
       // store element in a array
        int[] arr=new int[length];
       for(int i=0;i<length;i++){
           arr[i]=current2.data;
           current2=current2.next;
       }
       // use two pointer
        int left=0;
        int right=length-1;
        for(int i=0;i<length;i++){
           if(arr[left]!=arr[right]){
               return false;
           }
           left++;
           right--;
        }
        return true;
    }

    public static boolean isPalindromUsingStack(Node head){
        Stack stack=new Stack();
        Node current=head;
        while (current!=null){
            stack.push(current.data);
            current=current.next;
        }
        while (head!=null){
            if(head.data!=stack.pop().intValue()){
                return false;
            }
            head=head.next;
        }
        return true;
    }

    public static Node loopDetection(Node head){
        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there is a cycle, the slow and fast pointers will meet
            if (slow == fast) {
                break;
            }
        }

        // If there is no cycle, return null
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find the node at the beginning of the loop
        // This is based on the principle that the distance from the head of the list to the start of the loop
        // is the same as the distance from the meeting point to the start of the loop.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
//        Node head = new Node(10);
//        head.next = new Node(12);
//        head.next.next = new Node(11);
//        head.next.next.next = new Node(11);
//        head.next.next.next.next = new Node(12);
//        head.next.next.next.next.next = new Node(11);
//        head.next.next.next.next.next.next = new Node(10);

//        System.out.println("Linked list before removing duplicates:");
//        printList(head);
//        //addTail(100,head);
//        //printList(addBeginning(99,head));
//       // removeDuplicatesWithoutBuffer2(head);
////        addMiddle(99,head);
//        //deleteOneNode(12,head);
//        System.out.println("Linked list after removing duplicates:");
//        printList(reverseLinkedList(head));

        //System.out.println(findKthToLast(head,8).data);

        Node head = new Node(1);
        Node node2=new Node(2);
        head.next = node2;
        Node node3=new Node(3);
        head.next.next = node3;
        Node node4=new Node(4);
        head.next.next.next = node4;
        Node node5=new Node(5);
        head.next.next.next.next = node5;
        head.next.next.next.next.next =node2;

//
        //printList(reverseLinkedList(head));
        System.out.println(loopDetection(head).data);
//        printList(reverse(head));
        //System.out.println(isPalindromUsingStack(head));
//
//        int k = 2; // Example: Finding the 2nd-to-last element
//
//        Node result = findKthToLast(head, k);
//        if (result != null) {
//            System.out.println("The " + k + "th-to-last element is: " + result.data);
//        } else {
//            System.out.println("The list doesn't have " + k + " nodes.");
//        }
    }
}

