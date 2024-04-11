import java.util.*;

class MyCalculator {

    public void method1(int n, int p) {
        System.out.println((int) (Math.pow(n, p)));
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sc1 = sc.nextInt();

        for (int i = 0; i < sc1; i++) {
            try {
                int n = sc.nextInt();
                int p = sc.nextInt();
                MyCalculator obj = new MyCalculator();

                if (n < 0 || p < 0) {
                    throw new Exception("n and p should be non-negative");
                } else if (n == 0 && p == 0) {
                    throw new Exception("n and p should not be zero.");
                }
                obj.method1(n, p);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
