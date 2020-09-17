import java.util.Scanner;

public class BeregnByttepengene {
    public static void BeregnByttepengene(){
        // Lav scanner
        Scanner input = new Scanner(System.in);

        // Modtag beløbet
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double beløb = input.nextDouble();

        int resterendeBeløb = (int) (beløb * 100);

        // Find antallet af en dollar
        int AntalEnDollars = resterendeBeløb / 100;
        resterendeBeløb = resterendeBeløb % 100;

        // Find antallet af kvartaler i det resterende beløb
        int AntalQuarters = resterendeBeløb / 25;
        resterendeBeløb = resterendeBeløb % 25;

        // Find antallet af dimes i det resterende beløb
        int AntalDimes = resterendeBeløb / 10;
        resterendeBeløb = resterendeBeløb % 10;

        // Find antallet af nikkel i det resterende beløb
        int AntalNickels = resterendeBeløb / 5;
        resterendeBeløb = resterendeBeløb % 5;

        // Find antallet af øre i det resterende beløb
        int AntalPennies = resterendeBeløb;

        // Vis resultater
        System.out.println("Dit beløb  " + beløb + " består af ");
        System.out.println("    " + AntalEnDollars + " dollars");
        System.out.println("    " + AntalQuarters + " quarters ");
        System.out.println("    " + AntalDimes + " dimes");
        System.out.println("    " + AntalNickels + " nickels");
        System.out.println("    " + AntalPennies+ " pennies");
    }

    public static void main(String[] args) {
        BeregnByttepengene();
    }
}