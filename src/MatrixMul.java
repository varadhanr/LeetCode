import java.util.Arrays;
import java.util.HashMap;

public class MatrixMul {
	
	public static void main(String [] args) {
		
		String sss = args[1];
//		sss.eq
		sss.toCharArray();
		String num1 = "0";
		String num2 = "0";
		System.out.println(new MatrixMul().multiply(num1,num2));
		
	}
	
	
	    public String multiply(String num1, String num2) {
	        
	        HashMap<String,Integer> lookUpTable = new HashMap<String,Integer> (){{
	            
	            put("00",0);put("01",0);put("02",0);put("03",0);put("04",0);
	            put("05",0);put("06",0);put("07",0);put("08",0);put("09",0);
	            put("10",0);put("11",1);put("12",2);put("13",3);put("14",4);
	            put("15",5);put("16",6);put("17",7);put("18",8);put("19",9);
	            put("20",0);put("21",2);put("22",4);put("23",6);put("24",8);
	            put("25",10);put("26",12);put("27",14);put("28",16);put("29",18);
	            put("30",0);put("31",3);put("32",6);put("33",9);put("34",12);
	            put("35",15);put("36",18);put("37",21);put("38",24);put("39",27);
	            put("40",0);put("41",4);put("42",8);put("43",12);put("44",16);
	            put("45",20);put("46",24);put("47",28);put("48",32);put("49",36);
	            put("50",0);put("51",5);put("52",10);put("53",15);put("54",20);
	            put("55",25);put("56",30);put("57",35);put("58",40);put("59",45);
	            put("60",0);put("61",6);put("62",12);put("63",18);put("64",24);
	            put("65",30);put("66",36);put("67",42);put("68",48);put("69",54);
	            put("70",0);put("71",7);put("72",14);put("73",21);put("74",28);
	            put("75",35);put("76",42);put("77",49);put("78",56);put("79",63);
	            put("80",0);put("81",8);put("82",16);put("83",24);put("84",32);
	            put("85",40);put("86",48);put("87",56);put("88",64);put("89",72);
	            put("90",0);put("91",9);put("92",18);put("93",27);put("94",36);
	            put("95",45);put("96",54);put("97",63);put("98",72);put("99",81);
	        }};
//	        lookUpTable.rem
	        if(num1 == "0" || num2 == "0"){
	            return "0";
	        }
	        
	        if(num1 == "1" && num2 == "1"){
	            return "1";
	        }else if(num1 == "1" || num2 == "1"){
	            return num1 == "1" ? num2 : num1;
	        }
	        
	        int [] numberArray = new int[2 * num2.length()];
	        Arrays.fill(numberArray, 0);
	        
	        //int [] carry = new int[num2];
	        
	        for(int i=num1.length() - 1;i>=0;i--){
	            int carry = 0;
	            char n1 = num1.charAt(i);
	            int i_n1 = num1.length() - 1 - i;
	            int i_n2 = 0;
	            for(int j=num2.length() - 1;j>=0;j--){
	                
	                char n2 = num2.charAt(j);
	                int sum = lookUpTable.get(Character.toString(n1)+Character.toString(n2)) + numberArray[i_n1+i_n2] + carry;
	                carry = sum /10;
	                numberArray[i_n1+i_n2] = sum %10;
	                i_n2 ++;
	            }
	            if(carry > 0){
	                numberArray[i_n1+i_n2]  = numberArray[i_n1+i_n2] +carry;
	            }
	        }
	        
	        String s = new String();
	        for(int l = numberArray.length - 1;l>=0;l--){
	            s = s + String.valueOf(numberArray[l]);
	        }
	        
	        int leadingZeros = 0;
	        while (leadingZeros < s.length() && s.charAt(leadingZeros) == '0') 
	        	leadingZeros++; 
	        StringBuilder sb =  new StringBuilder(s);
	        sb.replace(0, leadingZeros, "");
	        
	        return sb.toString();
	        
	    }
	}


