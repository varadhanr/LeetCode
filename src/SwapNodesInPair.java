
public class SwapNodesInPair {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
//		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
//		l4.next = null;
		ListNode head = l1;
		ListNode fini = new SwapNodesInPair().swapPairs(head);
		
		while(fini != null) {
			System.out.println(fini.val);
			fini = fini.next;
		}

	}
	
public ListNode swapPairs(ListNode head) {
	
	if(head == null) return null;
    if(head.next == null) return head;
	
	ListNode headNext = head.next;
	ListNode tmp = head;
	sPairs(tmp, null);
	
	return headNext;
	
        
    }

public void sPairs(ListNode tmp,ListNode prevNode) {
	
	if(tmp == null) return ;
	if(tmp.next == null) return ;
	else {
		ListNode tmp1 = tmp;
		ListNode tmp2 = tmp.next;
		tmp1.next = tmp2.next;
		tmp2.next = tmp1;
		if(prevNode != null) {
			prevNode.next = tmp2;
		}
		sPairs(tmp1.next, tmp1);
		
	}
	
}

}
