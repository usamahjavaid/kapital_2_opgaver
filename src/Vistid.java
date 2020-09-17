import java.util. Scanner;

public class Vistid {
    public static void visSekunder(){

        Scanner input = new Scanner(System.in);
        // Bed brugeren om input
        System.out.print("Indtast hele tal for sekunder: ");
        int sekunder = input.nextInt();

        int minutter = sekunder / 60; // find minutter i sekunder
        int resterendesekunder = sekunder % 60; // sekunder tilbage
        System.out.println(sekunder + " sekunder er " + minutter +
                " minutter og " + resterendesekunder + " sekunder");

    }


    public static void main(String[] args) {

        visSekunder();



    }
}