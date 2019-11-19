import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptimalUtilization1 {

	public static void main(String[] args) {

		List<List<Integer>> a = new ArrayList<List<Integer>>();
		a.add(Arrays.asList(1, 8));
		a.add(Arrays.asList(2, 15));
		a.add(Arrays.asList(3, 9));
//		a.add(Arrays.asList(4, 10));
		

		List<List<Integer>> b = new ArrayList<List<Integer>>();
		b.add(Arrays.asList(1, 8));
		b.add(Arrays.asList(2, 11));
		b.add(Arrays.asList(3, 12));
//		b.add(Arrays.asList(4, 5));
		System.out.print(new OptimalUtilization1().resultList(a, b, 20));

	}

	public List<List<Integer>> resultList(List<List<Integer>> a, List<List<Integer>> b, int target) {

		int diff = Integer.MAX_VALUE;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Collections.sort(a, new ListComparator<>());
		Collections.sort(b, new ListComparator<>());
		int i = 0;
		int j = b.size() - 1;
		while (i < a.size() && j >= 0) {
			
			if(a.get(i).get(1) + b.get(j).get(1) > target) {
				j --;
			}else if(a.get(i).get(1) + b.get(j).get(1) <= target) {
				if(target - (a.get(i).get(1) + b.get(j).get(1)) < diff) {
					diff = target - (a.get(i).get(1) + b.get(j).get(1));
					res.clear();
					res.add(Arrays.asList(a.get(i).get(0),b.get(j).get(0)));
					
				}else if(target - (a.get(i).get(1) + b.get(j).get(1)) == diff) {
					res.add(Arrays.asList(a.get(i).get(0),b.get(j).get(0)));
				}
				i++;
			}

		}

		return res;
	}

	class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

		@Override
		public int compare(List<T> o1, List<T> o2) {
			return o1.get(1).compareTo(o2.get(1));
		}

	}
}
