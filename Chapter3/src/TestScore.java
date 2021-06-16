import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        int score1, score2, score3;
        Scanner scanner = new Scanner(System.in);
        score1 = scanner.nextInt();
        score2 = scanner.nextInt();
        score3 = scanner.nextInt();
        double average = (score1 + score2 + score3)*1.0/3;
        System.out.println(average);
        if(average >= 90)
            System.out.println("A");
        else if(average >=80)
            System.out.println("B");
        else if(average >=70)
            System.out.println("C");
        else if(average >=60)
            System.out.println("D");
        else
            System.out.println("F");
        scanner.close();

    }
}
