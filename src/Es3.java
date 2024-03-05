import java.util.Scanner;

public class Es3 {
    public static void main (String[] args){
        System.out.println("Es3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        System.out.println("The perimeter of the rectangle is " +
                perimeterRectangle(length, width));


        System.out.println("Enter a number to check if it is even or odd:");
        int number = scanner.nextInt();
        System.out.println("Is this number even or odd? " +
                eveOrOdd(number));


        System.out.println("Enter the lengths of the triangle's sides:");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        System.out.println("The area of the triangle is: " +
                areaTriangle(sideA, sideB, sideC));


        scanner.close();
    }

    public static double perimeterRectangle(double a, double b) {
        return (a + b)*2;
    }

    public static String eveOrOdd(int x) {
        if (x % 2 == 0) {
            return x + " is an Even number";
        } else {
            return  x + " is an Odd number";
        }
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c)/ 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
