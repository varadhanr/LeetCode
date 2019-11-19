
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class LetterCombinationOfPhoneNumber {
    List<String> output = new ArrayList<String>();
    Map<String, String> phone = new HashMap<String, String>() {{
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};
    
    public List<String> letterCombinations(String digits) {
        
        //Integer len = digits.length();
        return null;
    }
    
    public void backTrackAlgo(String combination,String digits){
        if(digits.length() == 0){
            output.add(combination);
        }else{
            
            }
        }
    
}
