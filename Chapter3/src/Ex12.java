import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input medium: ");
        String medium = scanner.nextLine();
        System.out.println("Input distance: ");
        double distance = scanner.nextDouble();
        double speed = 1;
        if(medium.equalsIgnoreCase("air"))
            speed = 1100;
        else if(medium.equalsIgnoreCase("water"))
            speed = 4900;
        else if(medium.equalsIgnoreCase("steel"))
            speed = 16400;

        double time;
        time = distance*1.0/speed;
        System.out.println("Time: " + time);
        scanner.close();
    }
}
