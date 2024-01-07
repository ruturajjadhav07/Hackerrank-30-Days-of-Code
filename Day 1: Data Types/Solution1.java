import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number i : ");
        int a = sc.nextInt();
        System.out.print("Enter number d : ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter string s : ");
        String c = sc.nextLine();
        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + c);



    }
}
