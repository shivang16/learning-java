package challenges;

import java.util.Scanner;

public class VariableChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Adjactive: ");
        String adjactive = scanner.next();
        System.out.println("Enter season of the year: ");
        String seasonOfTheYear = scanner.next();
        System.out.println("Enter whole number: ");
        int wholeNumber = scanner.nextInt();
        System.out.println("On a "+adjactive+" "+seasonOfTheYear+" day, I drink a maximum of "+wholeNumber+" cups of " +
                "coffee");
    }
}
