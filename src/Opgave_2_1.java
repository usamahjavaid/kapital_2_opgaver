import java.util.Scanner;

public class Opgave_2_1 {

    public static void main(String[] args) {

        double miles;

        Scanner in = new Scanner (System.in);

        System.out.println("miles in kilometers");
        miles = in.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(kilometers + "kilometers");

    }
}
