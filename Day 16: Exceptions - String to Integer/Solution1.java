import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string or number : ");
            int num = sc.nextInt();
            System.out.println(num);
        }

        catch (Exception e) {
            System.out.println(e);
            System.out.println("Bad String");
        }

    }
}
