
package hex2bin;

//import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//import java.util.Map;


public class Hex2Bin {

    
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        
        System.out.print("Introduzca una cadena Hexadecimal: ");
        int hexa = ac.nextInt();
       
        int num = (Integer.parseInt("hexa", 16));
        System.out.print(Integer.toBinaryString(num));
    private static Map<String, String> digiMap= new HashMap<>();
    static { 
    digiMap.put("0", "0000"); 
    digiMap.put("1", "0001"); 
    digiMap.put("2", "0010"); 
    digiMap.put("3", "0011"); 
    digiMap.put("4", "0100"); 
    digiMap.put("5", "0101"); 
    digiMap.put("6", "0110"); 
    digiMap.put("7", "0111"); 
    digiMap.put("8", "1000"); 
    digiMap.put("9", "1001"); 
    digiMap.put("A", "1010"); 
    digiMap.put("B", "1011"); 
    digiMap.put("C", "1100"); 
    digiMap.put("D", "1101"); 
    digiMap.put("E", "1110"); 
    digiMap.put("F", "1111"); 
}

static String hexToBin(String s) { 
    char[] hex=s.toCharArray(); 
    String binaryString=""; 
    for(char h : hex){ 
     binaryString=binaryString+ digiMap.get(String.valueOf(h)); 
    } 

    return binaryString; 
}
    }
    
}
