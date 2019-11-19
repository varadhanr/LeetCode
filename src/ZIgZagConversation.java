/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author varadhan
 */
public class ZIgZagConversation {
    public static void main(String[] args) {
        System.out.println(new ZIgZagConversation().convert("A", 1));
    }
    
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int stringLen = s.length();
        int currlevel = 0;
        char[] c= new char[s.length()];
        int newArrayPos = 0;
        boolean isLastLevel = false;
        boolean travelUp = false;
        while(currlevel < numRows){
             travelUp = false;
            if(numRows - currlevel == 1){
                isLastLevel = true;
                travelUp = false;
            }
            
            int startOfEachLevel = currlevel;
            while(startOfEachLevel < s.length()){
                if(currlevel == 0){
                travelUp = false;
            }
                c[newArrayPos++] = s.charAt(startOfEachLevel);
                if(isLastLevel){
                    startOfEachLevel = startOfEachLevel + (2*(numRows-1));
                }else if(travelUp){
                    startOfEachLevel = startOfEachLevel + 2*currlevel;
                    travelUp = false;
                }else{
                    startOfEachLevel = startOfEachLevel + (2*numRows - 2*currlevel - 2);
                    travelUp = true;
                }
            }
            currlevel++;
        }
        return new String(c);
    }
    
    /*
    PAYPALISHIRING,3
    P       A       H       N
    A   P   L   S   I   I   G 
    Y       I       R
    PAHNAPLSIIGYIR
    
    P           I           N
    A       L   S       I   G
    Y   A       H   R
    P           I
    PINALSINGYAHRPI
    */
}
