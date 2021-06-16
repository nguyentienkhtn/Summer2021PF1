import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class AndDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        /*
        use conditional operator to
        print the maximum of a and b
         */
        int max = a > b ? a:b;
        if(a > b)
            max = a;
        else
            max = b;
        System.out.println(max);

    }
}
