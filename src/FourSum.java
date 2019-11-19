import java.util.List;

public class FourSum {

	

	// Definition for singly-linked list.
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(11);
		ListNode node3 = new ListNode(12);
		ListNode node4 = new ListNode(13);
		ListNode node5 = new ListNode(14);
		ListNode node6 = new ListNode(15);
		ListNode node7 = new ListNode(16);
		ListNode node8 = new ListNode(17);
		ListNode head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = null;
		head = node1;
		 head = removeNthFromEnd(head,1);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		
		

	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int l=0;
		ListNode tmp1 = head;
		while(tmp1 != null) {
			l++;
			tmp1 = tmp1.next;
		}
		
		int toDelete = l-n;
		int i=1;
		ListNode tmp2 = head;
		while(i<toDelete) {
			i++;
			tmp2 = tmp2.next;
		}
		
		tmp2.next = tmp2.next.next;
		
		return head;
	}

}
