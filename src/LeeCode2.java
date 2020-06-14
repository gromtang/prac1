public class LeeCode2 {
    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n = n.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
 }
//            if (l2.next != null) {
//                    l2 = l2.next;
//                    } else {
//                    flag = false;
//                    if (l1.next == null && plus == 1) tmp.next = new ListNode(1);