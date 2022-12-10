package challenges;

import java.util.Scanner;

public class VariableChallenge {
    public static void variables(){
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

    public static void conditionalStatements(){
        Scanner scanner = new Scanner(System.in);
        int salary = 1000,bonus = 500,quota = 10;
        System.out.println("Enter sales: ");
        int sales = scanner.nextInt();
        if(sales>quota){
            salary+=bonus;
        }
        System.out.println("Final salary is: "+salary);
    }
    public static void main(String[] args) {
        conditionalStatements();
    }
}
