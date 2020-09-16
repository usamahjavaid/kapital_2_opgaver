import java.util.Scanner;

public class Opgave2_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter the amount of water in kilograms");
        double kilograms = input.nextDouble();

        System.out.println(" Enter the initial temperature " );
        double initialTemperature = input.nextDouble();

        System.out.println(" Enter the final temperature ");
        double finaltemperature = input.nextDouble();

        // calculating the energy
        double energy = kilograms * (finaltemperature - initialTemperature) * 4184;

        System.out.println(" The energy needed is " + energy);




    }

}
