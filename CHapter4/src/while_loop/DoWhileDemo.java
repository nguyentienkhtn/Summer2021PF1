package while_loop;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        char y;
        String temp;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("hello");
            System.out.println("continue?");
            temp = scanner.nextLine();
            y = temp.charAt(0);
        }
        while (y == 'y');

    }
}
