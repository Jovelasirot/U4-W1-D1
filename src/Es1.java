import java.util.Arrays;

public class Es1 {
    public static void main (String[] args){
        System.out.println("Es1");

        System.out.println("The product is: " +
                multiplication(10, 3));

        System.out.println("The concatenation result is: " +
                concatenate("Over", 9000));

        String[] ogArray = {"a", "b", "c", "d", "e"};
        String addString = "cat";



        System.out.println("The insertInArray result is: " +
                Arrays.toString(insertInArray(ogArray, addString)));
    }
    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static String concatenate(String str, int a){
        String numToString = String.valueOf(a);
        return str + numToString;
    }

    public static String[] insertInArray(String[] arrString, String str) {

        if (arrString.length != 5) {
            System.out.println("The array needs to have five elements");

        }


        String[] modifiedArray = new String[6];


        System.arraycopy(arrString, 0, modifiedArray, 0, 2);
        System.arraycopy(arrString, 2, modifiedArray, 3, 3);


        modifiedArray[2] = str;

        return modifiedArray;
    }
}