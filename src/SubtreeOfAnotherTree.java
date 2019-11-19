
public class SubtreeOfAnotherTree {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		TreeNode s1 = new TreeNode(4);
		TreeNode s2 = new TreeNode(5);
		TreeNode s3 = new TreeNode(1);
		TreeNode s4 = new TreeNode(2);
		TreeNode s5 = new TreeNode(1);
		root.right = s2;
		root.left = s1;
		s1.right = s4;
		s1.left = s3;
		s2.right = null;
		s2.left = null;
		s3.right = null;
		s3.left = s5;
		s4.left = null;
		s4.right = null;
		s5.left = null;
		s5.right = null;

		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		t1.right = t3;
		t1.left = t2;
		t2.left = null;
		t2.right = null;
		t3.left = null;
		t3.right = null;

		System.out.print(new SubtreeOfAnotherTree().isSubtree(root, t1));

	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {

		if (s == null)
			return false;

		if (isSame(s, t))
			return true;

		return isSubtree(s.left, t) || isSubtree(s.right, t);

	}

	public boolean isSame(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		if (t1.val != t2.val)
			return false;
		return isSame(t1.right, t2.right) && isSame(t1.left, t2.left);
	}

}
