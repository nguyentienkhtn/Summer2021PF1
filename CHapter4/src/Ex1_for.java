import java.util.Scanner;

public class Ex1_for {
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
        for(int i = 1; i <= x; i++)
            sum += i;
        System.out.println("total: " + sum);
    }
}
