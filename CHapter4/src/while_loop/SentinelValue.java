package while_loop;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        Scanner scanner = new Scanner(System.in);
        int sales;
        int sum = 0;
        System.out.println("input sales: ");
        sales = scanner.nextInt();
        while(sales != SENTINEL)
        {
            sum += sales;
            System.out.println("input sales: ");
            sales = scanner.nextInt();
        }
        System.out.println("Total sale: " + sum);
    }
}
