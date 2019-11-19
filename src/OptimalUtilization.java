import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalUtilization {

	public static void main(String[] args) {
		
		
		List<List<Integer>> a = new ArrayList<List<Integer>>();
		a.add(Arrays.asList(1,2));
		a.add(Arrays.asList(2,4));
		a.add(Arrays.asList(3,6));
		
		List<List<Integer>> b = new ArrayList<List<Integer>>();
		b.add(Arrays.asList(1,2));
		List<List<Integer>> res = new OptimalUtilization().func(a, b, 7);
		System.out.print(res);
		

	}

	public List<List<Integer>> func(List<List<Integer>> a, List<List<Integer>> b,
			int target) {
		
		int diff = Integer.MAX_VALUE;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(List<Integer> i : a) {
			int idofA = i.get(0);
			int valOfA = i.get(1);
			for(List<Integer> j:b) {
				
				int idOfB = j.get(0);
				int valOfB = j.get(1);
				
				if((valOfA + valOfB) <= target) {
					if(target - (valOfA + valOfB) < diff) {
						result.clear();
						result.add(new ArrayList<Integer>(Arrays.asList(idofA,idOfB)));
						diff = target - (valOfA + valOfB);
						
					}else if(target - (valOfA + valOfB) == diff) {
						
						result.add(new ArrayList<Integer>(Arrays.asList(idofA,idOfB)));
					}
				}
			}
		}
		return result;
	}

}
