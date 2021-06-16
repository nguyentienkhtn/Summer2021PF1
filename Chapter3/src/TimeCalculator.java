import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        int seconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input seconds: ");
        seconds = scanner.nextInt();
        if(seconds < 0)
            System.out.println("invalid input");
        else
        {
            if(seconds >= 3600)
                System.out.println("hours: " + seconds/3600);
            if(seconds >= 60)
                System.out.println("minutes: " + seconds/60);
            if(seconds >= 86400)
                System.out.println("days: " + seconds/86400);
        }
    }
}
