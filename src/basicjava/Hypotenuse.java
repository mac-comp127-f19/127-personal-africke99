package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        double hypotenuse = Math.sqrt((length1*length1)+(length2*length2));
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first length");
        double length1 = in.NextDouble();
        System.out.println("Enter the second length");
        double length2 = in.NextDouble();

        System.out.println("The hypotenuse of this triangle is: " + calculateHypotenuse);

    }


