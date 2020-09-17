import java.util.Scanner;
public class BeregnLån {
    public static void BeregnLån(){
        // Lav en scanner
        Scanner input = new Scanner(System.in);

        // Indtast årlig rente
        System.out.print("Indtast f.eks. Årlig rente 8.25: ");
        double ÅrligRentesats = input.nextDouble();

        // Få månedlig rente
        double MånedligRente = ÅrligRentesats / 1200;

        // Indtast antal år
        System.out.print(
                "Indtast f.eks. Antal år som et heltal 5: ");
        int AntalÅr = input.nextInt();

        // Indtast lånebeløbet
        System.out.print("Indtast f.eks. Lånebeløbet 120000.95: ");
        double LåneBeløb = input.nextDouble();

        // Beregn betaling
        double MånedligeBetaling = LåneBeløb * MånedligRente / (1
                - 1 / Math.pow(1 + MånedligRente, AntalÅr * 12));
        double totalBetaling = MånedligeBetaling * AntalÅr * 12;

        // Vis resultater
        System.out.println("Den månedlige betaling er DKK" +
                (int) (MånedligeBetaling * 100) / 100.0);
        System.out.println("Den samlede betaling er DKK" +
                (int) (totalBetaling * 100) / 100.0);
    }

    public static void main(String[] args) {
        BeregnLån();
    }
}