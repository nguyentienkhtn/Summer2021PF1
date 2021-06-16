import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input total calories: ");
        int totalCalories = scanner.nextInt();
        System.out.println("input grams of fat: ");
        int gramOfFat = scanner.nextInt();
        int caloriesFromFat = gramOfFat * 9;
        double fatPercent = caloriesFromFat*100.0/totalCalories;
        if (fatPercent < 30)
            System.out.println("low fat");

        scanner.close();

    }
}
