import java.util.Scanner;

public class Moms {
    public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print(" Købesum: ");

        double købesum = input.nextDouble();

        double skat = købesum * 0.25;

        System.out.println("salgsmoms er DKK " + (int) (skat * 100) / 100.0);
    }


    public static void plusTyskmMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print(" Købesum: ");

        double købesum = input.nextDouble();

        double skat = købesum * 0.16;

        System.out.println("salgsmoms is D-mark " + (int) (skat * 100) / 100.0);


    }

    public static void main(String[] args) {


        plusDanskMoms();
        plusTyskmMoms();

    }
}
