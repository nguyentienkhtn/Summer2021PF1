import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        double score1, score2, score3;
        String temp;
        char y;
        Scanner scanner = new Scanner(System.in);
        do {
            // score 1
            System.out.println("input score 1:");
            score1 = scanner.nextDouble();
            while (score1 < 0 || score1 > 100)
            {
                System.out.println("Invalid score 1");
                System.out.println("input score 1:");
                score1 = scanner.nextDouble();
            }
            // score 2
            System.out.println("input score 1:");
            score2 = scanner.nextDouble();
            while (score2 < 0 || score2 > 100)
            {
                System.out.println("Invalid score 2");
                System.out.println("input score 2:");
                score2 = scanner.nextDouble();
            }
            // score 3
            System.out.println("input score 1:");
            score3 = scanner.nextDouble();
            while (score3 < 0 || score3 > 100)
            {
                System.out.println("Invalid score 3");
                System.out.println("input score 3:");
                score3 = scanner.nextDouble();
            }

            // average
            double average = (score1 + score2 + score3)/3;
            char letterScore;
            // calculate letter score
            if(average < 60)
                letterScore = 'F';
            else if(average < 70)
                letterScore = 'D';
            else if(average < 80)
                letterScore = 'C';
            else if(average < 90)
                letterScore = 'B';
            else
                letterScore = 'A';
            // display letter score
            System.out.println(letterScore);
            // ask user if he wants to continue
            System.out.println("Continue? ");
            scanner.nextLine();
            temp = scanner.nextLine();
            y = temp.charAt(0);
        } while (y == 'y');

    }
}
