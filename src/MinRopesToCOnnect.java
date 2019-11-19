import java.util.PriorityQueue;

public class MinRopesToCOnnect {
	
	public static void main(String [] args) {
		
		int ropes []  = {2,2,3,3};
		System.out.print(new MinRopesToCOnnect().findMinCost(ropes));
		
	}
	
	public int findMinCost(int [] ropes) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		for(int i:ropes) {
			pQueue.add(i);
		}
		
		int minCost = 0;
		while(pQueue.size() != 1) {
			int first = pQueue.poll();
			int second = pQueue.poll();
			minCost += first + second;
			pQueue.add(first+second);
		}
		return minCost;
	}

}
