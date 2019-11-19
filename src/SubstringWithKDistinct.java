import java.util.HashMap;
import java.util.Map;

public class SubstringWithKDistinct {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,2,3};
		int k = 2;
		System.out.print(new SubstringWithKDistinct().subarraysWithKDistinct(arr, k));

	}

	public int subarraysWithKDistinct(int[] A, int K) {
        int size = A.length;
        int count = 0 ;
		// stores the count of each integer appearing in the sliding window
        Map<Integer, Integer> m = new HashMap<>();
		// end points of window
        int l=0, r=0;
        while(true) {
			// let p be the index of 1st element such that no. of distinct elements in window [l, p] is K
			// run right pointer till you find p
            while(r<size && m.size()< K) {
                add(m, A[r]);
                r++;
            }
			
			// return answer if we run out of elements
            if(m.size()!=K) return count;
            
			// At this point, r is one pointer ahead of p & we have K elements in the window [l, p]
			
			int temp = r-1;
			// Start from p and count for all indexes for which window [l, temp] has K elements. These are the possible ends of the sub array starting at l.
            while(temp<size && has(m, A[temp])) {
                count++;
                temp++;
            }
			
			// since all the end pointers have been counted for subarray starting at l, we can move to next element as starting point of subarray
            remove(m, A[l]);
            l++;
        }
    }
    public void add(Map<Integer, Integer> m, int i) {
        m.put(i, m.getOrDefault(i, 0)+1);
    }
    
    public boolean has(Map<Integer, Integer> m, int i){
        return m.getOrDefault(i, 0)!=0;
    }
    
    public void remove(Map<Integer, Integer> m, int i) {
        int count = m.getOrDefault(i, 0);
        if(count<2) m.remove(i);
        else m.put(i, count - 1);
    }

}
