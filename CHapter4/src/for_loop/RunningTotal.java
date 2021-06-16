package for_loop;

import java.util.Scanner;

public class RunningTotal {
    public static void main(String[] args) {
        int totalSales;
        totalSales = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 7; i++)
        {
            System.out.println("Input sales for day " + (i + 1));
            int sales = scanner.nextInt();
            totalSales += sales;
        }
        System.out.println("Total sales: " + totalSales);

    }
}
