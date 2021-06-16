import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        System.out.println("input a character");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        char input = temp.charAt(0);
        while (input < 'a' || input > 'o')
        {
            System.out.println("invalid input!!");
            System.out.println("input a character");
            temp = scanner.nextLine();
            input = temp.charAt(0);

        }
        System.out.println(input);


    }
}
