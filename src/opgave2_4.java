import java.util.Scanner;

public class opgave2_4 {

    public static void main(String[] args) {

        double square_meter;

        Scanner in = new Scanner (System.in);

        System.out.println("square meter to ping");
        square_meter = in.nextDouble();

        double ping = square_meter * 0.3025;

        System.out.println(ping + " pings");



    }
}
