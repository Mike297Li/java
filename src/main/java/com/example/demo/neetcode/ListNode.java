package main.java.com.example.demo.neetcode;

public class ListNode {

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
//    Input: head = [1,2,6,3,4,5,6], val = 6
//    Output: [1,2,3,4,5]
    public ListNode removeElements(ListNode head, int val) {
        // 头节点符合要求，删除头节点
       while(head!=null && head.val==val){
           ListNode ret =head;
           head=head.next;
           ret.next=null;
       }
       // 中间元素符合要求
        ListNode pre=head;
       if(pre==null){
           return head;
       }
        while (pre.next!=null){
            ListNode delNode=pre.next;
            if(delNode.val==val){
               pre.next=delNode.next;
               delNode.next=null;
            }else {
                pre=pre.next;
            }
        }
        return head;
    }

   //  使用虚拟头节点
    public static ListNode removeElements2(ListNode head, int val) {
        // -1是任意值
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        // 不用在讨论是否头节点，因为加上虚拟头节点之前链表所有节点都是中间节点了
//        if(head==null){
//            return head;
//        }
        ListNode pre=dummyNode;
        while (pre.next!=null){
            ListNode delNode=pre.next;
            if(delNode.val==val){
                pre.next=delNode.next;
                delNode.next=null;
            }else {
                pre=pre.next;
            }
        }
        // 返回虚拟头节点以后的节点
        return dummyNode.next;
    }

    public ListNode(int[] arr){
        if(arr==null || arr.length==0)
            throw new IllegalArgumentException("arr is empty");
        this.val=arr[0];
        ListNode current=this;
        for(int i=1;i<arr.length;i++){
             ListNode listNode=new ListNode(arr[i]);
             current.next=listNode;
             current=current.next;
        }
    }

    @Override
    public String  toString(){
        StringBuilder sb=new StringBuilder();
        ListNode current=this;
        while (current!=null){
            sb=sb.append(current.val+"--->");
            current=current.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6};
        ListNode listNode=new ListNode(arr);
        System.out.println(listNode);
        ListNode listNode1 = removeElements2(listNode, 6);
        System.out.println(listNode1);
    }


}
