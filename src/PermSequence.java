import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PermSequence {
	
	public static void main(String[] args) {
		
//		String
//		Math.po
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(Entry<Integer, Integer> i : map.entrySet()) {
//			i.get
//			i.get
		}
		System.out.println(new PermSequence().getPermutation(3, 3));
		
	}
	
public String getPermutation(int n, int k) {
        
        return recursive(n,k,"",0,0);
        
    }
    
    public String recursive(int n,int k,String str,int threshold,int i){
        
        if(str.length() == n){
            return str;
        }
      //  String s=str;
        for(int j = i;j<n;j++){
             str = recursive(n,k,str+String.valueOf(j+1),threshold,j+1);
             if(str.length() == n)
            	 threshold ++;
            if(threshold == k)
                break;
            else if(str.length() == n){
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(j-1,str.charAt(str.length() - 1));
                str = sb.substring(0,str.length() - 1);
            }
                
        }
        return str;
        
    }

}
