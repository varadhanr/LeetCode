
public class MergeKLinkedList {

	public static void main(String[] args) {
		
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		ListNode head1 = l1;
		
		
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(3);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		ListNode head2 = l4;
		
		ListNode l7 = new ListNode(2);
		ListNode l8 = new ListNode(6);
		l7.next = l8;
		l8.next = null;
		ListNode head3 = l7;
		
		ListNode[] lists = new ListNode[] {head1,head2,head3};
		ListNode fini = new MergeKLinkedList().mergeKLists(lists);
		
		while(fini != null) {
			System.out.println(fini.val);
			fini = fini.next;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 1) {
			return lists[0];
		} else if (lists.length == 2) {
			return mergeTwoLists(lists[0], lists[1]);
		}
//	ListNode first = lists[0];
//	ListNode second;
		ListNode merged = lists[0];
		for (int i = 1; i < lists.length; i++) {
			merged = mergeTwoLists(lists[i], merged);
		}
		return merged;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null && l2 != null) {
			return l2;
		} else if (l2 == null && l1 != null) {
			return l1;
		}
		ListNode head;
		if (l1.val < l2.val) {
			head = l1;
			l1 = l1.next;

		} else {
			head = l2;
			l2 = l2.next;

		}
		ListNode tmp = head;
		while (l1 != null || l2 != null) {
			if (l1 == null && l2 != null) {
				tmp.next = l2;
				tmp = l2;
				l2 = l2.next;
			} else if (l2 == null && l1 != null) {
				tmp.next = l1;
				tmp = l1;
				l1 = l1.next;
			} else if (l1.val < l2.val) {
				tmp.next = l1;
				tmp = l1;
				l1 = l1.next;
			} else {
				tmp.next = l2;
				tmp = l2;
				l2 = l2.next;
			}
		}
		return head;
	}
}
