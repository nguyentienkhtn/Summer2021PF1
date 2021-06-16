import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double speed = -1, distance;
        int time = -1;
        Scanner scanner = new Scanner(System.in);
        while(speed < 0)
        {
            System.out.println("input speed: ");
            speed = scanner.nextDouble();
        }
        while(time < 0)
        {
            System.out.println("input time: ");
            time = scanner.nextInt();
        }

        System.out.println("Hour \tDistance Traveled \n" +
                        "--------- -----------------");
        for(int i = 1; i <= time; i++)
        {
            distance = i*speed;
            System.out.println(i + "\t\t\t" + distance);
        }

    }
}
