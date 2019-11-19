import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	
	public static void main(String [] args) {
		
		int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		System.out.println(Arrays.deepToString(new MergeIntervals().merge(intervals)));
//		Arrays.spl
		List<Integer> ls = new ArrayList<Integer>();
//		ls.get
		String s = "";
		StringBuilder sb = new StringBuilder();
		sb.substring(start, end);
		String a =sb.substring(10, 20);
		System.out.println(s.length());
	}
	
public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,new SortComp());
        int [] [] result = new int [intervals.length][];
        
        result[0] = intervals[0];
        int resultPointer = 0;
        for(int i=1;i<intervals.length;i++){
            int [] val = intervals[i];
            int [] prevVal = result[resultPointer];
            if(prevVal[1] >= val[0] ){
                prevVal[1] = prevVal[1] > val[1] ? prevVal[1] : val[1];
            }else{
                resultPointer ++;
                result[resultPointer] = val;
            }
            
        }
        return intervals;

}
}

class SortComp implements Comparator<int []>{
    public int compare (int [] l1,int [] l2){
        return l1[0] > l2[0] ? 1 : l1[0] == l2[0] ? 0 : -1;
    }
}


