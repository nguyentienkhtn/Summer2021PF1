import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a positive int value:");
        int x = scanner.nextInt();
        while (x <= 0)
        {
            System.out.println("Invalid input!!!");
            System.out.println("Input a positive int value:");
            x = scanner.nextInt();
        }
        int sum = 0;
        // sum = 1 + 2 + 3 + ... + x
        int i = 1;
        while(i <= x)
        {
            sum += i;
            i ++;
        }
        System.out.println("Sum from 1 to " + x + " is " + sum);
    }
}
