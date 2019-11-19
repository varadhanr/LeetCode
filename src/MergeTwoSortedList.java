
public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(4);
		
		ListNode head1 = a1;
		a1.next = a2;
		a2.next = a3;
		a3.next = null;
		
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(3);
		ListNode b3 = new ListNode(4);
		
		ListNode head2 = b1;
		b1.next = b2;
		b2.next = b3;
		b3.next = null;
		
		ListNode result = new MergeTwoSortedList().mergeTwoLists(head1, head2);
		
		while(result != null) {
			System.out.print(result.val);
			result = result.next;
		}

	}

	public static class  ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null && l2 == null) return null;
		
		if(l1 == null || l2 == null)
			return l1 == null ? l2 : l1;
		ListNode head;
		
		if(l1.val < l2.val) {
			head = l1;
			l1 = l1.next;
		}else {
			head = l2;
			l2 = l2.next;
		}
		
		ListNode temp = head;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
				temp = temp.next;
			}else {
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}
		}
		
		if(l1 == null || l2 == null) {
			
			if(l1 == null) {
				while(l2 != null) {
					temp.next = l2;
					l2=l2.next;
					temp = temp.next;
				}
				
			}else {
				
				while(l1 != null) {
					temp.next = l1;
					l1 = l1.next;
					temp = temp.next;
				}
				
			}

		}

		return head;
	}

}
