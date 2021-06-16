import javax.swing.*;
import java.util.Scanner;

public class Compact {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double milesDriven = scanner.nextDouble();
        double gasUsed = scanner.nextDouble();
        double milesPerGallon = milesDriven/gasUsed;
        System.out.println(milesPerGallon);
    }
}
