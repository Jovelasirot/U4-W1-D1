public class Es3 {
    public static void main (String[] args){
        System.out.println("Es3");

        System.out.println("The perimeter of the rectangle is " +
                perimeterRectangle(10.5, 5.5));

        System.out.println("Is this number even or odd? " +
                eveOrOdd(11));

        System.out.println("The area of the triangle is: " +
                areaTriangle(12.1, 9.2, 5.1));
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
