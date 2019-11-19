
public class SubtreeOfATree {

	public static void main(String[] args) {

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {

		if(s == null && t == null) {
			return true;
		}
		
		if(isSame(s, t)) {
			return true;
		}else {
			if(isSubtree(s.left, t)) {
				return true;
			}else if(isSubtree(s.right, t)) {
				return true;
			}
		}
		return false;

	}
	
	public boolean isSame(TreeNode s,TreeNode t) {
		if(s == null && t != null ) {
			return false;
		}
		if(s != null && t == null) {
			return false;
		}
		if(s == null && t==null) {
			return true;
		}
		if(s.val != t.val) {
			return false;
		}
		
		isSame(s.left, t.left);
		isSame(s.right, t.right);
		return true;
	}

}
