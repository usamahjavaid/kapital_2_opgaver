import java.util.Scanner;

public class opgave2_2_version2 {
    public class Volumeofatriangle {

    }

    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Receive the length of sides of a triangle.
        System.out.print("Enter the length of your triangle: ");
        double lengthOfSides = input.nextDouble();

        //area of triangle.
        double areaOfTriangle = lengthOfSides * lengthOfSides * Math.sqrt(3) / 4;

        //volume of triangle.
        double volumeOfTriangle = areaOfTriangle * lengthOfSides;

        System.out.println("The triangle has an area of " + areaOfTriangle +
                "and a volume of " + volumeOfTriangle);
    }
}