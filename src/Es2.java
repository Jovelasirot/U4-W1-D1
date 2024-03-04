import java.util.Scanner;

public class Es2 {
    public static void main (String[] args){
        System.out.println("Es2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first word");
        String firstWord = scanner.nextLine();

        System.out.println("Type the second word");
        String secondWord = scanner.nextLine();

        System.out.println("Type the third word");
        String thirdWord = scanner.nextLine();

        System.out.println("What you typed in order " +
                (firstWord + " " + secondWord + " " + thirdWord));

        System.out.println("What you typed reversed " +
                (thirdWord + " " + secondWord + " " + firstWord));


        String concatenatedString = firstWord + " " + secondWord + " " + thirdWord;

        StringBuilder reversedString = new StringBuilder(concatenatedString).reverse();

        System.out.println("What you typed reversed word and order" +
                reversedString);
    }


}
