import java.util.PriorityQueue;

public class MinRopesToCOnnect2 {
	
	public static void maint(String [] args) {
		
		int ropes []  = {20,4,8,2};
		System.out.print(new MinRopesToCOnnect2().findMinCost(ropes));
		
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
			minCost = first + second;
			pQueue.add(first+second);
		}
		return minCost;
	}

}
