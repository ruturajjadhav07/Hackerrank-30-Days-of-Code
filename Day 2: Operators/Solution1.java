import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. DOUBLE meal_cost
     * 2. INTEGER tip_percent
     * 3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        
        double tip = meal_cost * tip_percent / 100;
        double tax =meal_cost * tax_percent / 100;

        int TotalCost = (int) Math.round(meal_cost + tip + tax);
        
        System.out.println("Meal price : "+meal_cost);
        System.out.println("Given tip : "+tip_percent);
        System.out.println("Tax : "+tax_percent);
     
        System.out.println("\nTotal Calculation after all cuttings : ");
        System.out.println("\nCalculated Tip : "+tip);
        System.out.println("Calculated Tax :"+tax);
        System.out.println("Total cost : "+TotalCost);


    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Meal Price : ");
        double meal_cost = Double.parseDouble(br.readLine().trim());

        System.out.print("Given Tip : ");
        int tip_percent = Integer.parseInt(br.readLine().trim());

        System.out.print("Tax : ");
        int tax_percent = Integer.parseInt(br.readLine().trim());


       
        
        Result.solve(meal_cost, tip_percent, tax_percent);



        




        br.close();
    }
}
