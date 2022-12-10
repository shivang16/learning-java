package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of hours worked: ");
        int hours = scanner.nextInt();

        System.out.println("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        double totalRate = hours*payRate;

        System.out.println("Total rate="+totalRate);
    }
}
