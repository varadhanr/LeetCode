
public class SwapNodesInKReverse {

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
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next =l5;
		l5.next = null;
		ListNode head = l1;
		int k=2;
		ListNode fini = new SwapNodesInKReverse().reverseKGroup(head, k);
		while(fini != null) {
			System.out.println(fini.val);
			fini = fini.next;
		}
		
		
		

	}
	
public ListNode reverseKGroup(ListNode head, int k) {
	
	if(head == null) return null;
	ListNode tail = head;
	for(int i=1;i<k;i++) {
		if(tail.next == null) return head;
		tail = tail.next;
	}
	
		ListNode tailNext = tail.next;
		tail.next = null;
		reverse(head);
		
		head.next = reverseKGroup(tailNext, k);
		
        return tail;
    }

public ListNode reverse(ListNode head) {
	
	ListNode current = head;
	ListNode prev = null;
	ListNode next = null;
	while(current != null) {
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
	}
	
	return prev;
}

}
