import java.util.Scanner;

public class Opgave2_3 {

    public static void main(String[] args) {

        double meter;

        Scanner in = new Scanner (System.in);

        System.out.println("meters to feet");
        meter = in.nextDouble();

        double feet = meter * 3.2786;

        System.out.println(feet + " feet");

    }

}
