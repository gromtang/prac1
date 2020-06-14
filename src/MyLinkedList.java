
//https://leetcode-cn.com/problems/design-linked-list/solution/she-ji-lian-biao-by-leetcode/
//head作为伪头！！！！！！！！！
class MyLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3,0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        list.get(4);
        list.addAtHead(4);
        list.addAtIndex(5,0);
        list.addAtHead(6);



    }

    class Node{
        int val;
        Node next,prev;

        private Node(){}
        private Node(int val){
            this.val = val;
        }
    }

    Node head;
    Node tmp;
    int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(0);
        length = 1;
    }
    public MyLinkedList(int val) {
        head = new Node(val);
        length = 1;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= length) return -1;
        if(index == 0) return head.val;
        for(int i = 1; i <= index; i++) {
            tmp = head.next;
        }
        return tmp.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        tmp = new Node(val);
        head.prev = tmp;
        tmp.next = head;
        head = tmp;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new Node(val);
        tmp.next.prev = tmp;
        length++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0) return;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index > length) return;
        if(index == length) {
            addAtTail(val);
            return;
        }
        for(int i = 1; i <= index; i++) {
            tmp = head.next;
        }
        Node newnode = new Node(val);
        newnode.prev = tmp.prev;
        tmp.prev.next = newnode;
        tmp.prev = newnode;
        newnode.next = tmp;
        length++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;
        if(index == 0) {
            head = head.next;
            head.prev = null;
            length--;
            return;
        }
        for(int i = 1; i <= index; i++) {
            tmp = head.next;
        }
        tmp.prev.next = tmp.next;
        tmp.next.prev = tmp.prev;
        length--;
    }
}