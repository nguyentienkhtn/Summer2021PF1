public class DecrementIncrementDemo {
    public static void main(String[] args) {
       int a = 10;
       int b = 10;
       int c = 10;
       // a -> 11
        // c -> 11
        // b -> 10
        int y = 10;
        y++;
        ++y;
       int x = (++a) + b-- + ++c; // x -> 32
        // b -> 9
        System.out.println(" " + a +" " + b + " " +c + " " + x);

    }
}
