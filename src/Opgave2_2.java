import java.util.Scanner;
public class Opgave2_2 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of the Triangle:");
        double a = s.nextDouble();
        double area = ((Math.sqrt(3) / 4) * (a * a));
        System.out.println("Area of Triangle is: " + area);


        double volume = area * a;

        System.out.println("The volume of the Triangular prism is" + volume);
    }
}