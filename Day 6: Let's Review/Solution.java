
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
  
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
      
            String str = sc.nextLine();

            char[] str1 = str.toCharArray();

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(str1[j]);
                }
            }
            System.out.print(" ");

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 1) {
                    System.out.print(str1[j]);
                }
            }
            System.out.println();
        }
    }
}
