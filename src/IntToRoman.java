
import java.util.HashMap;
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
public class IntToRoman {

    public static void main(String[] args) {
        System.out.println(new IntToRoman().intToRoman(1994));
    }
    
    public String intToRoman(int num) {
        int len = String.valueOf(num).length();
        Map<Integer, String> symbol = new HashMap<Integer, String>();
        symbol.put(1, "I");
        symbol.put(4, "IV");
        symbol.put(5, "V");
        symbol.put(9, "IX");
        symbol.put(10, "X");
        symbol.put(40, "XL");
        symbol.put(50, "L");
        symbol.put(90, "XC");
        symbol.put(100, "C");
        symbol.put(400, "CD");
        symbol.put(500, "D");
        symbol.put(900, "CM");
        symbol.put(1000, "M");
        return calculate(num, symbol, new StringBuilder());
    }
    
    public String calculate(int num, Map<Integer, String> map, StringBuilder finalStr) {
        if (num == 0) {
            return finalStr.toString();
        }
        int len = String.valueOf(num).length();
        int remainder = 0;
        if (len == 4) {
            finalStr = finalStr.append(map.get(1000));
            remainder = num - 1000;
        } else if (len == 3) {
            if (num >= 100 && num < 400) {
                finalStr = finalStr.append(map.get(100));
                remainder = num - 100;
            } else if (num >= 400 && num < 500) {
                finalStr = finalStr.append(map.get(400));
                remainder = num - 400;
            } else if (num >= 500 && num < 900) {
                finalStr = finalStr.append(map.get(500));
                remainder = num - 500;
            } else if (num >= 900 && num < 1000) {
                finalStr = finalStr.append(map.get(900));
                remainder = num - 900;
            }
            
        } else if (len == 2) {
            if (num >= 10 && num < 40) {
                finalStr = finalStr.append(map.get(10));
                remainder = num - 10;
            } else if (num >= 40 && num < 50) {
                finalStr = finalStr.append(map.get(40));
                remainder = num - 40;
            } else if (num >= 50 && num < 90) {
                finalStr = finalStr.append(map.get(50));
                remainder = num - 50;
            } else if (num >= 90 && num < 100) {
                finalStr = finalStr.append(map.get(90));
                remainder = num - 90;
            }
            
        } else if (len == 1) {
            if (num >= 1 && num < 4) {
                finalStr = finalStr.append(map.get(1));
                remainder = num - 1;
            } else if (num >= 4 && num < 5) {
                finalStr = finalStr.append(map.get(4));
                remainder = num - 4;
            } else if (num >= 5 && num < 9) {
                finalStr = finalStr.append(map.get(5));
                remainder = num - 5;
            } else if (num >= 9 && num < 10) {
                finalStr = finalStr.append(map.get(9));
                remainder = num - 9;
            }
        }
        
        return calculate(remainder, map, finalStr);
    }
    
}
