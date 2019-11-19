import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		System.out.println(new ValidParanthesis().isValid("()[]{}"));
	}

	public boolean isValid(String s) {

		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (ch == '{' || ch == '(' || ch == '[') {
				stk.push(ch);
			} else if (ch == '}' || ch == ')' || ch == ']') {
				if(stk.isEmpty()) {
					return false;
				}
				Character match = stk.pop();
				if (!((ch == '}' && match == '{') || (ch == ']' && match == '[') || (ch == ')' && match == '('))) {
					return false;
				}
			}
		}
		
		if(stk.isEmpty()) {
			return true;
		} else
		return false;

	}

}
