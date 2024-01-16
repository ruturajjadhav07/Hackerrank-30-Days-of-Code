import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        char[] binary = Integer.toBinaryString(n).toCharArray();
        int Count = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i++){
            Count = (binary[i] == '0') ? 0 : Count + 1; 
            if(Count > maxCount){
                maxCount = Count;
            }
        }
        System.out.println(maxCount);
    }
}
