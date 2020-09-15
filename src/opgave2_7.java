import java.util.Scanner;
public class opgave2_7 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println(" input the number of minutes: ");

        int min = input.nextInt();
        int years = min / (60 * 24 * 365);

        int days = min / 60 / 24 % 365;

        System.out.println( min + " minutes is " + years + "years and " + days + "days");




    }
}
