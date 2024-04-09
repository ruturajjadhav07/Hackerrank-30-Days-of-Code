import java.util.Scanner;

class Difference {
    private int[] elements;
    private int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        computeDifference();
    }
    public void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int currentDifference = Math.abs(elements[i] - elements[j]);
                if (currentDifference > maximumDifference) {
                    maximumDifference = currentDifference;
                }
            }
        }
    }
    public int getMaximumDifference() {
        return maximumDifference;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        System.out.println(difference.getMaximumDifference());
    }
}
