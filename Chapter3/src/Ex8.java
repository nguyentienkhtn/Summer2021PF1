import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        final int PRICE = 99;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number of packages: ");

        int noOfPackages = scanner.nextInt(); // doc du lieu tu ban phim
        int subTotal = noOfPackages*PRICE;
        double discountRate = 0;
        if(noOfPackages >= 100)
            discountRate = 0.5;
        else if(noOfPackages >= 50)
            discountRate = 0.4;
        else if(noOfPackages >= 20)
            discountRate = 0.3;
        else if(noOfPackages >= 10)
            discountRate = 0.2;
        else
            discountRate = 0;
        System.out.println("discount: " + (subTotal) * discountRate);
        System.out.println("total: " + (subTotal) *(1 - discountRate));
        scanner.close();



    }
}
