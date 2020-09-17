import java.util.Scanner;

public class FahrenheitTilCelsius {
    public static void FahrenheitTilCelsius(){
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast en grad i Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converter Fahrenheit til Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " er " +
                celsius + " i Celsius");

    }
    public static void main(String[] args) {

        FahrenheitTilCelsius();


    }
}