
public class VisAktuelTid {
    public static void VisAktuelTid(){
        // Få de samlede millisekunder siden midnat, Jan 1, 1970
        long totalMillisekunder = System.currentTimeMillis();

        // Få de samlede sekunder siden midnat, Jan 1, 1970
        long totalSekunder = totalMillisekunder / 1000;

        // Beregn det aktuelle sekund i minut i timen
        long nuværendeSekunder = totalSekunder % 60;

        // Få de samlede minutter
        long totalMinutter = totalSekunder / 60;

        // Beregn det aktuelle minut i timen
        long nuværendeMinutter = totalMinutter % 60;

        // Få de samlede timer
        long samledeTimer = totalMinutter / 60;

        // Beregn den aktuelle time
        long nuværendeTime = samledeTimer % 24;

        //Vis resultater
        System.out.println(" Nuværende tid er  " + nuværendeTime + ":"
                + nuværendeMinutter + ":" + nuværendeSekunder + " GMT");


    }
    public static void main(String[] args) {
       VisAktuelTid();
    }
}