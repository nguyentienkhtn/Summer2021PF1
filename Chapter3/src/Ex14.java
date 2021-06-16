import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfBook;
        System.out.println("Input the number of books purchased in this month:");
        noOfBook = scanner.nextInt();
        int point = 0;
        while(noOfBook < 0)
        {
            System.out.println("Invalid input");
            System.out.println("Input the number of books purchased in this month:");
            noOfBook = scanner.nextInt();
        }
        if(noOfBook == 0)
            point = 0;
        else if (noOfBook == 1)
            point = 5;
        else if (noOfBook == 2)
            point = 15;
        else if (noOfBook == 3)
            point = 30;
        else
            point = 60;
        System.out.println("your point is " + point);

    }
}
