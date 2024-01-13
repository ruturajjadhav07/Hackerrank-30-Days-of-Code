
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want : ");
        int N = sc.nextInt();
        int Array[] = new int[N];
        for (int i = 0; i < N; i++) {
            Array[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int reverseArray = N - i - 1;
            System.out.print(Array[reverseArray] + " ");
        }
    }
}
